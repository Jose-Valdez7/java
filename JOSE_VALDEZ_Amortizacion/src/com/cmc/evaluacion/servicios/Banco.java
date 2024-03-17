package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;
	
	
	public Banco() {
		this.prestamos = new ArrayList<Prestamo>();
		this.clientes = new ArrayList<Cliente>();
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	public Cliente buscarCliente(String cedula) {
		Cliente clienteBuscado=null;
		Cliente elementoCliente=null;
		for(int i=0;i<clientes.size();i++) {
			elementoCliente=clientes.get(i);
			if(elementoCliente.getCedula().equals(cedula)) {
				clienteBuscado=elementoCliente;
			}
		}
		return clienteBuscado;
	}
	
	public void registrarCliente(Cliente cliente) {
		Cliente clienteE=buscarCliente(cliente.getCedula());
		if(clienteE==null) {
			clientes.add(cliente);
		}else{System.out.println("Cliente ya Existe :"+clienteE.getCedula());}	
	}
	
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente cliente = buscarCliente(cedula);
        if (cliente != null) {
        	cliente.agregarPrestamo(prestamo);
            prestamos.add(prestamo);
        } else {
            System.out.println("No es cliente del banco.");
        }
	}
	
	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
        Cliente cliente = buscarCliente(cedula);
        if (cliente == null) {
            return null;
        } else {
            return cliente.getPrestamos();
        }
    }
}
