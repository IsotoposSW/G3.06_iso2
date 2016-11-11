package org.Radar;

public class Radar {
	
	//Generar constructor

	private datosVehiculo DatosVehiculo;
	private int vMaxima;
	private int v100;
	private int v300;
	private int v400;
	private int v500;
	private int v600;
	private int multa = 0;
	private int puntos = 0;
	
	//Generar Getters y Setters
	
	private void inicializar(){
		switch vMaxima{
		case 30
			v100 = 31;
			v300 = 51;
			v400 = 61;
			v500 = 71;
			v600 = 81;
		break;
		case 40
			v100 = 41;
			v300 = 61;
			v400 = 71;
			v500 = 81;
			v600 = 91;
		break;
		case 50
			v100 = 51;
			v300 = 71;
			v400 = 81;
			v500 = 91;
			v600 = 101;
		break;
		case 60
			v100 = 61;
			v300 = 91;
			v400 = 111;
			v500 = 121;
			v600 = 131;
		break;
		case 70
			v100 = 31;
			v300 = 51;
			v400 = 61;
			v500 = 71;
			v600 = 81;
		break;
		case 80
			v100 = 81;
			v300 = 111;
			v400 = 131;
			v500 = 141;
			v600 = 151;
		break;
		case 90
			v100 = 91;
			v300 = 121;
			v400 = 141;
			v500 = 151;
			v600 = 161;
		break;
		case 100 
			v100 = 101;
			v300 = 131;
			v400 = 151;
			v500 = 161;
			v600 = 171;
		break;
		case 110
			v100 = 111;
			v300 = 141;
			v400 = 161;
			v500 = 171;
			v600 = 181;
		break;
		case 120
			v100 = 121;
			v300 = 151;
			v400 = 171;
			v500 = 181;
			v600 = 191;
		break;
	}
	}
	
	private boolean esSancionable(datosVehiculo DatosVehiculo, int vMaxima){
		inicializar();
		int v = datosvehiculo.getVelocidad()
		boolean esSancionable = false;
		
		if (v >= v600){
			multa = 600;
			puntos = 6;
			esSancionable = true;
		}else if (v >= v500){
			multa = 500;
			puntos = 6;
			esSancionable = true;
		}else if (v >= v400){
			multa = 400;
			puntos = 4;
			esSancionable = true;
		}else if (v >= v300){
			multa = 300;
			puntos = 2;
			esSancionable = true;
		}else if (v >= v100){
			multa = 100;
			esSancionable = true;
		}
		
		return esSancionable;
		
		if (esSancionable){
			enviarSancion();
		}
	}
	
	private void enviarSancion(datosVehiculo DatosVehiculo, int vMaxima){
		
		//Falta ingeniería inversa de Macario.
		//Qué hay que enviar; a quién.
		
	}
}
