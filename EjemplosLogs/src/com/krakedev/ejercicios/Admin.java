package com.krakedev.ejercicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger=LogManager.getLogger(Admin.class);
	
	public void agregar() {
		//agregados en orden de importancia o detalle
		logger.warn("Mensaje de warn");
		logger.info("Mensaje de info");//info no critica los 2 primeros
		logger.debug("Mensaje de debug");//por que camino se fue flujos
		logger.trace("Mensaje de trace");
		
		//error va siempre
		logger.error("Mensaje de error");
	}
}
