package org.generation.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		//Acceder a la informacion de los onjetos 
		System.out.println(brandon.getNombre() + " " + brandon.getApellido() + " trabaja como: " + brandon.getPuesto());
		System.out.println(alberto.getNombre() + " " + alberto.getApellido() + " tiene un salrio base de: " + alberto.getSalario() + " pero  se le incrementaron  $2,000 quedando su salario de:" + (alberto.getSalario()+2000));
		//volvemos a imprimir el objeto alberto
		System.out.println(alberto);// se sige observando el mismo salario por que no lo guardamos  como parte  de su atributo del objeto 
		
		//Modificar la informacion de los objetos(Setters)
		float nuevoSalario = alberto.getSalario() +2000;
		alberto.setSalario(nuevoSalario);// guardo el nuevo salario como parametro del setter
		System.out.println(alberto);// podemos obserbar que el salario si se modifico 
		
	 
	}

}
