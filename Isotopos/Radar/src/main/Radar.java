package org.Radar;
import java.util.Random;
import java.text.DecimalFormat;

import Multas.src.edu.uclm.esi.iso2.multas.domain.Manager;

public class Radar {
	
	
	public static void main( String[] args ){
	
			abrirIncidencia()
	}
	
	public static void abrirInvestigacion(){
		String localizaciones[]={"Guarroman","Ciudad Real","Lepe","Villatopo","Torremolinos", "Chillón", "Retuerta del Bullaque", "Cebolla", "Ajo", "Perejil"};   
		double velocidadesMaximas[]= {30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
		
		DecimalFormat df4 = new DecimalFormat("0000");
		Random r = new Random();
		
		int A = (int) Math.floor(Math.random()*(0000-3128+1)+3128);			
		double B = (double) Math.floor(Math.random()*(000-300+1)+300);
		int aux = (int) Math.floor(Math.random()*(0-10+1)+10);
				
		String license = df4.format(A);
		double speed = B;
		String location = localizaciones[aux];
		double maxSpeed = velocidadesMaximas[aux];
		
		Manager.openInquiry(license, speed, location, maxSpeed);
	
			
	}
	
	}
}
