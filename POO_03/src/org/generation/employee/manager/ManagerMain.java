package org.generation.employee.manager;

import org.generation.employee.Employee;

public class ManagerMain {
	public static void main(String[] args) {
		
		Manager brandon = new Manager("Brandon","Ferrer",27,42000.0f,"Project", 5,2000f);
		System.out.println(brandon);
		brandon.supervisar();// Metodo sde la subclase Manager
		brandon.calcularSalario();// Anula el metodo de la superclase y ejecuta el metodos de la subclase
		brandon.trabajar();// Metodo de la superclase Employee
		
		//Instaciamos un nuevo objeto pero de la clase Employee que vive en otro paquete
		
		Employee jose = new Employee("jose","angel",230,32000.0f,"QA");
		jose.trabajar(); //Metodo de la clase Employee
		jose.calcularSalario(); //Metodo de la clase Employee
		//jose.supervisar(); //Metodo de la clase Manager por lo cual no puede ejecutarse el metodo ya que este objeto esta instaciado desde la clase Employee
		
		
	}

}
