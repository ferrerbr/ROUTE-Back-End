package org.generation.employee;
//Esta clase es la plantilla de mi objeto que recive atributos( variables de instancia) y compotamientos (metodos del objeto. Tambien recibe metodos  cosntructores, metodos de accesibilidad (Getters y Setters) y metodos de conversion (toString)

public class Employee {
	//1.Declarar atributos (varibles estancia
	 String nombre ;
	 String apellido;
	 int edad;
	 float salario;
	 String puesto;
	 
	 //2.Método constructor: el metodo constructor recibe el mismo nombre de la clase, no retorna algo, recibe como argumentos o parametros  a los atributos  del objeto (o no ) y estos se guardan con la palabra reservada this 
	 
	 public Employee(String nombre, String apellido, int edad,  float salario, String puesto) {
		 this.nombre = nombre;
		 this.apellido = apellido;
		 this.edad =edad;
		 this.salario = salario;
		 this.puesto = puesto ;
		 
	 }
	 //existe una forma de generar rapidamente  el metodo constructor con clic derecho / source / generate constructor using fields
	 
	 
	 //3.Metodos de comportamiento
	  public  void trabajar () {
		  System.out.println("Estoy trabajando");
	  }
	  public void calcularSalario() {
		  System.out.println("El salario es de "+ this.salario);
	  }
	  
	  public void informacion() {
		  System.out.println("nombre: " + this.nombre +" Apellido: " + this.apellido + " Edad: " + this.edad + " puesto: " + this.puesto);
		  }
		  
	// Podemos acceder a la informacion de cada objeto por medio del constructor  hay otra forma de acceder con metodos getters y setters
		  
	//4. Médotos de accesibilidad y  modificacion  a la ondormacion de los atributos del objeto(Getters and Setters)
	  
	  public String getNombre() {
		  return nombre;
	  } // el metodo debe conincidir en tipo de dato con la variable que stoy por llamar y debe iniciar con la palabra getNombredeLaVariable
	  
	  public void setNombre(String nombre) {
		  this.nombre = nombre;
	  } // el metodo set  no devuelve nada por eso es del tipo void 
	  
	  
	  public String getApellido() {
		  return apellido;
	  } 
	  
	  public void setApellido(String apellido) {
		  this.apellido = apellido;
	  }
	  
	  public int getEdad() {
		  return edad;
	  } 
	  
	  public void setEdad(int edad) {
		  this.edad = edad;
	  }
	  
	  public float getSalario() {
		  return salario;
	  } 
	  
	  public void setSalario(float salario) {
		  this.salario = salario;
	  }
	  
	  public String getPuesto() {
		  return puesto;
	  } 
	  
	  public void setPuesto(String puesto) {
		  this.puesto = puesto;
	  }
	
	  //otra forma de generar los Getters y Setters es mediante clic derecho /sourse/ generate Getters and Setters
	  
	  
	  //5. Método de conversion  a String (toString)
	  // si no definimos el metodo to String  cuando mandemos a imprimir en consola el objeto, nos mostrara solamente el espacio en memoria del objeto como en los arrays cuando 
	  // defininiedo este metodo conviente toda mi informacion a una cadena de texto
	 //lo vamos a generar con clic derecho /source / generate to String
	  
	  
	  @Override 
	public String toString() {
		return "Employee [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", puesto=" + puesto + "]";
	}
	  
	//  @Override  se utiliza para indicar que un método está sobrescribiendo (o sobrecargando) un método de una clase padre o interfaz
		  
	  
	 
	 

}
