package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Cuentas;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminCuentas {
	private static final Logger LOGGER=LogManager.getLogger(AdminCuentas.class);
	
	public static void insertar(Cuentas cuenta) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Cuenta a insertar>>> "+cuenta);
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("insert into cuentas(numero_cuenta,cedula_propietario,saldo,fecha_creacion)"
					+ "values (?,?,?,?)");
			ps.setString(1, cuenta.getNumeroCuenta());
			ps.setString(2, cuenta.getCedulaUsuario().getCedula());
			ps.setBigDecimal(3, cuenta.getSaldo());
			ps.setDate(4, new java.sql.Date(cuenta.getFechaCreacion().getTime()));
			
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void actualizar(Cuentas cuenta) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Cuenta a actualizar>>>> "+cuenta);
	
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("update cuentas set cedula_propietario=?,saldo=?,fecha_creacion=? where numero_cuenta=?");
			ps.setString(1, cuenta.getCedulaUsuario().getCedula());
			ps.setBigDecimal(2, cuenta.getSaldo());
			ps.setDate(3, new java.sql.Date(cuenta.getFechaCreacion().getTime()));
			ps.setString(4, cuenta.getNumeroCuenta());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			LOGGER.error("Error al actualizar "+e);
			throw new Exception("Error al actualizar"); 
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	} 
	
	public static void eliminar(String numero_cuenta)throws Exception {
		Connection con =null;
		PreparedStatement ps;
		LOGGER.trace("Cuenta a eliminar con numero_cuenta>>> " + numero_cuenta);
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("delete from cuentas where numero_cuenta=?");
			ps.setString(1,numero_cuenta);
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			LOGGER.error("Error al eliminar",e);
			throw new Exception("Error al eliminar");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de Datos",e);
				throw new Exception("Error con la base de Datos");
			}
		}
		
	}
	
	
}
