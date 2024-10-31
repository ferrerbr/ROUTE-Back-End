package org.generation.employee.developer;

import org.generation.employee.Employee;
import org.generation.employee.Trabajador;

public class Developer extends Employee implements Trabajador{
	
	//Atributos  Departamento, Lenguajes(java,python,sql,matlab,rubyk,JavaScript),level(jr,middle,senior)
	//Clases de tipo enum 
	private NivelDeDominio nivel;
	private Lenguaje lenguaje;
	
	//metodo constructor
	public Developer(String nombre,String apellido, int edad, float salario, String puesto, NivelDeDominio nivel,Lenguaje lenguaje ) {
		super( nombre, apellido,  edad,  salario,  puesto);
		
		this.nivel = nivel;
		this.lenguaje = lenguaje;
		
	}
	
	//Metodos propios de esta clase 
	
	//anulamos(Overriding) el metodo trabajar de la superclase Employee
	@Override 
	public void trabajar() {
		System.out.println("El" + this.getPuesto() +" "+ this.nivel +"que trabaja con el lenguaje de programacion " + this.getPuesto() + "desarollando las APIs");
	}
	
	public NivelDeDominio getNivel() {
		return nivel;
	}
	
	public void setNivel(NivelDeDominio nivel) {
		this.nivel = nivel;
	}
	
	public Lenguaje getLenguaje() {
		return lenguaje;
	}
	
	public void setLenguaje(Lenguaje lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	
	//Metodo toString

	@Override
	public String toString() {
		return "Developer nivel:" + nivel + ", lenguaje:" + lenguaje + ", Nombre: " + getNombre()
				+ ", Apellido:" + getApellido() + ", Edad: " + getEdad() + ", Salario: " + getSalario()
				+ ", Puesto: " + getPuesto()  ;
	}
	
	
	
	
	

}
