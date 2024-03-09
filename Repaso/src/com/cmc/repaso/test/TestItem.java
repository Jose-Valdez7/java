package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item producto1=new Item();
		producto1.setNombre("COLA");
		producto1.setProductosActuales(20);
		producto1.imprimir();
		producto1.vender(12);
		producto1.imprimir();
		producto1.devolver(5);
		producto1.imprimir();
		
		Item producto2=new Item();
		producto2.setNombre("CHICLES");
		producto2.setProductosActuales(2004);
		producto2.imprimir();
		producto2.vender(561);
		producto2.imprimir();
		producto2.devolver(25);
		producto2.imprimir();
	}

}
