package com.app.presentacion;

import com.app.logica.Artista;
import com.app.logica.Cancion;
import com.app.logica.ControladoraLogica;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
	public static void main(String[] args) {
	
		ControladoraLogica conLog = new ControladoraLogica();
		try {
		// CREAR AL MENOS DOS ARTISTAS, Y DOS CANCIONES
	Calendar cal1 = new GregorianCalendar(1972, Calendar.AUGUST, 9);
		Date fechaJuanes = cal1.getTime();
		
		Calendar cal2 = new GregorianCalendar(2009, Calendar.DECEMBER, 11);
		Date fechaChepe = cal2.getTime();
	Artista a1 = new Artista("Juanes", "Pop", "colombiano", 45, fechaJuanes);
			conLog.crearArtista(a1);
			
			Artista a2 = new Artista("Chepe", "Tango", "argentino", 17, fechaChepe);
			conLog.crearArtista(a2);
	
		} catch (Exception e) {
			System.out.println("No se pudo crear el elemento: " + e.getMessage());
		}

	}
}


