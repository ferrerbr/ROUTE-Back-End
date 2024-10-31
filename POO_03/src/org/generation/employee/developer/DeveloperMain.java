package org.generation.employee.developer;

import org.generation.employee.Employee;
import org.generation.employee.manager.Manager;

public class DeveloperMain {
	public static void main(String[] args) {
		
		Developer daniel = new Developer("Daniel ", "Maldonado",35,27345.6f,"Front End Dev",NivelDeDominio.SENNIOR,Lenguaje.JAVA);
		Manager daniela =new Manager("Daniela ", "Cruz",35,17345.6f,"Front End Dev",5,2000f);
		Employee miguel = new Employee("Miguel ", "Barrera",25,27345.6f,"QA");
				
				
		System.out.println(daniel);
		System.out.println(daniela);
		System.out.println(miguel);
		
		
		daniel.trabajar();// metodo sobre escrito de la superclase Employee en Desarrollador
		daniela.calcularSalario();//Metodo sobreescrito de la superclase Employee es Manager
		miguel.calcularSalario(); // Metodo propio de la clase Employee
	}

}
