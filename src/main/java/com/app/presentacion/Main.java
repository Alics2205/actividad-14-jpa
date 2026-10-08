package com.app.presentacion;

import com.app.logica.Artista;
import com.app.logica.Cancion;
import com.app.logica.ControladoraLogica;

public class Main {
	public static void main(String[] args) {
	
		ControladoraLogica conLog = new ControladoraLogica();
		try {
		// CREAR AL MENOS DOS ARTISTAS, Y DOS CANCIONES
	
		Artista a1 = new Artista("milena", "regue","colombiano",34);
        Artista a2 = new Artista("sofia", "cumbia","aregentina",25);

       Cancion c1 = new Cancion("el sol",2.34f,2000);
       Cancion c2 = new Cancion("flor",6.23f,2018);
	
		} catch (Exception e) {
			System.out.println("No se pudo crear el elemento: " + e.getMessage());
		}

	}
}


