package org.generation.iterador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Iterador {
	public static void main(String[] args) {
		//1.Iterar mediante ciclo forEach
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.addAll(Arrays.asList("Mitzi",",salvador","emilio","moni","cinthia","felipe","ricardo"));
		System.out.println(nombres);
		
		for(String nombre:nombres) {
			System.out.println(nombre);
		}
		
		
		//2.Iterar mediante interfase iterator
		System.out.println("-----ITERATOR-----");
		ArrayList<Double> salarios = new ArrayList<Double>();
		
		salarios.addAll(Arrays.asList(19000.22, 22300.23, 23000.24, 15001.25, 14500.26));
		System.out.println(salarios);
		
		//Mandamos a llamar la interfase iterator y la importamos . posee la misma sintaxis de una colleccion, pero no va a instanciar un nuevo objeto  de Iterator si no que  aplicara un metodo del tipo iterator()
		Iterator<Double> iteradorSalarios = salarios.iterator();
		
		System.out.println(iteradorSalarios); //Output:java.util.ArrayList$Itr@5b480cf9
		
		//Necesitamos aplicar otros metodos de iterator (hasNext() y .next())en un ciclo while para determinar si existen elementos en el arrayList(Boolean) y mostrar dichos elementos
		
		while(iteradorSalarios.hasNext()) {
			double salario =iteradorSalarios.next();
			System.out.println(salario);
		}
		
		
		//3.Iterar Mediante Expresiones Lambda(son un tipo de fuinciones que nos permiten mandar a llamar de manera anonima y poder iterar sobre una collecion) y foreach
		System.out.println("-----LAMBDA-----");
		
		ArrayList<String> posiciones = new ArrayList<String>();
		posiciones.addAll(Arrays.asList("IDE","Desarollador Fullstack","Front end Dev","UX/UI","Back end","Front end","QA"));
		System.out.println(posiciones);
		
		posiciones.forEach((posicion)->{
			System.out.println(posicion);
			
		});
		
		
	}

}
