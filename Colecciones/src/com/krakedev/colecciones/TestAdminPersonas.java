package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin=new AdminPersonas();
		admin.agregar(new Persona("Mario","Benedetti",50));
		admin.agregar(new Persona("Claro","Kent",30));
		admin.agregar(new Persona("Bruno","Diaz",25));
		admin.imprimir();
		
		Persona p1=admin.buscarPorNombre("Jose");
		if(p1!=null) {
		System.out.println("ENCONTRADO: "+p1.getApellido()+" "+p1.getEdad());
		}else {System.out.println("No existe la PERSONA");}
	
		ArrayList<Persona> personasMayores=admin.buscarMayores(15);
		System.out.println("Mayores: "+personasMayores.size());
	}

}
