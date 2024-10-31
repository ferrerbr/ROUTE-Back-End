package org.generation.employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
		//aqui podemos empezar a instanciar nuevos objetos de la clase Employee
				Employee brandon = new Employee("Brandon","Ferrer",27,22000.0f,"Back End Developer");
				Employee salvador = new Employee("Salvador","Gonzalez",29,19420.2f,"fullstack Dev");
				Employee moni = new Employee( "Monica ", "Jasso",27,22345.6f,"Front End Dev");
				Employee mitzi = new Employee("Mitzi","Martinez",26,30524.5f,"MES Dev");
				Employee alberto = new Employee("Alberto", "Montes de oca",28,9548.0f,"FullStack Dev");
				
				
				System.out.println(brandon); // nos debolvera lo que especificamos en el método toString
				System.out.println(salvador);
				System.out.println(moni);
				System.out.println(mitzi);
				System.out.println(alberto);
			
				
				//Ivocamos los métodos de comportamiento del objeto
				brandon.trabajar();
				moni.informacion();
				mitzi.calcularSalario();
				
	}

}
