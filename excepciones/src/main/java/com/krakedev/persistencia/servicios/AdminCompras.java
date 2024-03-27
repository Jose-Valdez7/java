package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminCompras {
	private static final Logger LOGGER = LogManager.getLogger(AdminCompras.class);

	public static void insertar(Compras compra) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Compra a insertar>>> " + compra);
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into compras(id_compra,cedula,fecha_compra,monto)"
							+ "values(?,?,?,?);");
			ps.setInt(1, compra.getId_compra());
			ps.setString(2, compra.getCedulaCliente().getCedula());
			ps.setDate(3, new java.sql.Date(compra.getFechaCompra().getTime()));
			ps.setBigDecimal(4, compra.getMonto());


			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

	}

	public static void actualizar(Compras compra) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Compra a actualizar>>> " + compra);
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"update compras set cedula=?, fecha_compra=?, monto=? where id_compra=?");
			ps.setString(1, compra.getCedulaCliente().getCedula());
            ps.setDate(2, new java.sql.Date(compra.getFechaCompra().getTime()));
            ps.setBigDecimal(3, compra.getMonto());
            ps.setInt(4, compra.getId_compra());

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void eliminar(int id_compra)throws Exception {
		Connection con =null;
		PreparedStatement ps;
		LOGGER.trace("Compra a eliminar con codigo>>> " + id_compra);
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("delete from compras where id_compra=?");
			ps.setInt(1,id_compra);
			
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
