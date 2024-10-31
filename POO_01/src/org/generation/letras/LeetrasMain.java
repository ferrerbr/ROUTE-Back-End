package org.generation.letras;

public class LeetrasMain {
	public static void main(String[] arg) {
		//1.Instanciar objetos de las clases que ya creamos 
		
		Letras lt = new Letras();
		Contador contador = new Contador();
		
		
		//2.Aplicar metodos a acada instancia
		lt.contexto("Escribe un texto para conocer el numero de vocales, consonantes, numeros y simbolos que posee");
		String tex = lt.leerEntrada();
		
		int totalVocales = contador.contarVocales(tex);// estop lo  usare para mostrarle a usuario cuantas vocales tiene su texto del tipo int
		lt.contexto("Hay " + totalVocales + " Vocales");
		
		int totalConsonantes =contador.contarConsonantes(tex);
		lt.contexto("Hay " + totalConsonantes + " Consoantes" );
		
		int totalNumeros = contador.contarNumeros(tex);
		lt.contexto("Hay "+ totalNumeros + " Numeros");
		
		int totalSimbolos = contador.contarSimbolos(tex);
		lt.contexto("hay " + totalSimbolos +" Simbolos");
		
		
		
		
	}
}
