package org.generation.letras;

import java.util.Scanner;

//En letras vamos a crear metodos que  sirven para interactuar con el ususario
public class Letras {
	
	//Definir scanner para recibir informacionj del ususario
	
	Scanner sc = new Scanner(System.in);
	
	//Metodos para retornar el scanner y utilizarlo las veces que quiera
	public String leerEntrada() {
		return sc.nextLine();
	}
	
	//Método para darle contexto al usuario
	public void contexto(String mensaje) {
		System.out.println(mensaje);
	}
	
	
	
	//Cerrramos el scaner

}
