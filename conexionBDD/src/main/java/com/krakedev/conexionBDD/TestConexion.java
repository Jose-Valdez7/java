package com.krakedev.conexionBDD;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement ps=null;
		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Joxz27102905");
			System.out.println("conexion exitosa");
			ps=connection.prepareStatement("insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
					+ "values(?,?,?,?,?,?,?,?,?);");
			ps.setString(1, "1722823343");
			ps.setString(2, "Angelica");
			ps.setString(3, "Andrade");
			ps.setString(4, "S");
			ps.setInt(5, 2);
			ps.setDouble(6, 1.56);
			ps.setBigDecimal(7, new BigDecimal(1200.34));
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr="2020/03/22 10:05:04";
			Date fecha=null;
			try {
				fecha=sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis=fecha.getTime();
				System.out.println(fechaMilis);
				//crea un java.sqlDate, partiendo de un java.util.Date
				java.sql.Date fechaSQL= new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				Time tSQL=new Time(fechaMilis);
				System.out.println(tSQL);
				
				ps.setDate(8, fechaSQL);
				ps.setTime(9, tSQL);
				
				ps.executeUpdate();
				System.out.println("Ejecuta insert 1");
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			ps1=connection.prepareStatement("insert into compras (id_compra,cedula,monto,fecha_compra)"
					+ "values(?,?,?,?);");
			ps1.setInt(1, 11);
			ps1.setString(2, "1892093452");
			ps1.setBigDecimal(3, new BigDecimal(100.54));
			
			SimpleDateFormat sdf1=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr1="2024/03/12 13:55:08";
			Date fecha1=null;
			try {
				fecha1=sdf1.parse(fechaStr1);
				long fechaMilis1=fecha1.getTime();
				java.sql.Date fechaSQL1= new java.sql.Date(fechaMilis1);		
				Time tSQL1=new Time(fechaMilis1);
				
				ps1.setDate(4, fechaSQL1);
				
				ps1.executeUpdate();
				System.out.println("Ejecuta insert 2");
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			ps2=connection.prepareStatement("insert into cuentas(numero_cuenta,cedula_propietario,saldo,fecha_creacion)"
					+ "values (?,?,?,?)");
			ps2.setInt(1, 11);
			ps2.setString(2, "12385");
			ps2.setBigDecimal(3, new BigDecimal(928.98));
			
			SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr2="2022/05/11";
			Date fecha2=null;
			try {
				fecha2=sdf2.parse(fechaStr2);
				long fechaMilis2=fecha2.getTime();
				java.sql.Date fechaSQL2= new java.sql.Date(fechaMilis2);		
				
				ps2.setDate(4, fechaSQL2);
				
				ps2.executeUpdate();
				System.out.println("Ejecuta insert 3");
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
