package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;
import com.krakedev.persistencia.utils.Convertidor;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
							+ "values(?,?,?,?,?,?,?,?,?);");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFichaNacimiento().getTime()));
			ps.setTime(9, new java.sql.Time(persona.getHoraNacimiento().getTime()));

			ps.executeUpdate();

		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al insertar", e);
			// mostrar el error al usuario
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

	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"update personas set nombre=?, apellido=?, estado_civil_codigo=?, numero_hijos=?, estatura=?, cantidad_ahorrada=?, fecha_nacimiento=?, hora_nacimiento=? where cedula=?");
			ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getEstadoCivil().getCodigo());
            ps.setInt(4, persona.getNumeroHijos());
            ps.setDouble(5, persona.getEstatura());
            ps.setBigDecimal(6, persona.getCantidadAhorrada());
            ps.setDate(7, new java.sql.Date(persona.getFichaNacimiento().getTime()));
            ps.setTime(8, new java.sql.Time(persona.getHoraNacimiento().getTime()));
            ps.setString(9, persona.getCedula());

			ps.executeUpdate();

		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al actualizar", e);
			// mostrar el error al usuario
			throw new Exception("Error al actualizar");
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
	
	public static void eliminar(String cedula)throws Exception {
		Connection con =null;
		PreparedStatement ps;
		LOGGER.trace("Persona a eliminar con cédula>>> " + cedula);
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("delete from personas where cedula=?");
			ps.setString(1,cedula);
			
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
	
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception{
		ArrayList<Persona> personas=new ArrayList<Persona>();
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("select * from personas where nombre like ?");
			ps.setString(1, "%"+nombreBusqueda+"%");
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				String nombre=rs.getString("nombre");
				String cedula=rs.getString("cedula");
				Persona p=new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);	
				personas.add(p);
			}
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por Nombre",e);
			throw new Exception("Error al consultar por Nombre");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de Datos",e);
				throw new Exception("Error con la base de Datos");
			}
		}
		
		return personas;
	}
	
	public static Persona buscarPorCedula(String cedulaBuscada) throws Exception {
		Persona p=new Persona();
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("select * from personas where cedula=?");
			ps.setString(1, cedulaBuscada);
			
			rs=ps.executeQuery();
			
			if(rs.next()) {
				String nombre=rs.getString("nombre");
				String apellido=rs.getString("apellido");
				int numeroHijos=rs.getInt("numero_hijos");
				p.setApellido(apellido);
				p.setNombre(nombre);
				p.setNumeroHijos(numeroHijos);
			}else {
				return null;
			}
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por Cedula",e);
			throw new Exception("Error al consultar por Cedula");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de Datos",e);
				throw new Exception("Error con la base de Datos");
			}
		}
		
		return p;
	}
	
	public static ArrayList<Persona> buscarPorApellido(String apellidoBusqueda) throws Exception{
		ArrayList<Persona> personas=new ArrayList<Persona>();
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("select * from personas where apellido like ?");
			ps.setString(1, "%"+apellidoBusqueda+"%");
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				String nombre=rs.getString("nombre");
				String cedula=rs.getString("cedula");
				int numeroHijos=rs.getInt("numero_hijos");
				double estatura=rs.getDouble("estatura");
				String fechaNacimiento = rs.getString("fecha_nacimiento");
				String horaNacimiento = rs.getString("hora_nacimiento");
				
				Persona p=new Persona();
				//formato de fecha convertidor
				Date fechaNac=Convertidor.convertirFecha(fechaNacimiento);
				Date horaNac=Convertidor.convertirHora(horaNacimiento);
				p.setCedula(cedula);
				p.setNombre(nombre);
				p.setNumeroHijos(numeroHijos);
				p.setEstatura(estatura);
				p.setFichaNacimiento(fechaNac);
				p.setHoraNacimiento(horaNac);

				personas.add(p);
			}
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por Apellido",e);
			throw new Exception("Error al consultar por Apellido");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de Datos",e);
				throw new Exception("Error con la base de Datos");
			}
		}
		
		return personas;
	}
}
