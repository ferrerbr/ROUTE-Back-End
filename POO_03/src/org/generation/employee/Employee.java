package org.generation.employee;

public class Employee implements Trabajador {
	//1.Atributos
	
	private String nombre ;
	private String apellido;
	private int edad;
	private float salario;
	private String puesto;
	 
	 //2.Constructor
	public Employee(String nombre,String apellido, int edad, float salario, String puesto ) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.puesto =puesto;
		
	}
	//3. Metodos especificos 
	// como estos  trabajar es un metodo que se implementa de la interfaz Tranbajador debo señalarlko con la anotacion @Override
	@Override 
	 public  void trabajar () {
		  System.out.println("Estoy trabajando");
	  }
	
	@Override
	  public void calcularSalario() {
		  System.out.println("El salario es de "+ this.salario);
	  }
	  
	  public void informacion() {
		  System.out.println("nombre: " + this.nombre +" Apellido: " + this.apellido + " Edad: " + this.edad + " puesto: " + this.puesto);
		  }
	  
	  //4.Getters y setters 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
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
	
	
	//5. Metodo to string
	@Override
	public String toString() {
		return "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", salario: " + salario
				+ ", puesto: " + puesto;
	}
	
	  
	  
	  

}
