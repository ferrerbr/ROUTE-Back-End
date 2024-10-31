package org.generation.employee.manager;

import org.generation.employee.Employee;
import org.generation.employee.Trabajador;

//Clase que me permite  asignar atributos especifics de un Manager pero , esta vez esta  esta misma clase  herede los atributos y metodos de la clase Employee
//Para que esta clase  herede  los atributos y metodos de Employee, debe convertise en una subclase que extiende de  una superclase
public class Manager  extends Employee implements Trabajador {
	//1. Atributos Propios de un Manager
	private int colaboradores;
	private float bono;
	
	//2. Metodo constructor. Recibe los atributos de la clase employee
	
	public Manager(String nombre,String apellido, int edad, float salario, String puesto, int colaboradores, float bono ) {
		super(nombre,apellido,edad,salario,puesto);
		this.colaboradores =colaboradores;
		this.bono = bono;
		
	}
	//3.Metodos especificos de un manager
	public void supervisar() {
		System.out.println("¿Cómo van?");
	}
	
	//Metodo que nos permite calcular el salraio de un manager
	//Mismo metodo que Employee pero aplicando un Overriden(anulacion de metodos)
	@Override 
	public void calcularSalario() {
		float salarioTotal = this.getSalario() + this.bono;
		System.out.println("El salario del Manager " +this.getNombre() + " " + this.getApellido() +" es de: $" +salarioTotal );
		
	}
	
	//4. Getters y setters
	public int getColaboradores() {
		return colaboradores;
	}
	public void setColaboradores(int colaboradores) {
		this.colaboradores = colaboradores;
	}
	public float getBono() {
		return bono;
	}
	public void setBono(float bono) {
		this.bono = bono;
	}
	
	//5 Metodo toString
	@Override
	public String toString() {
		return "Manager "+ this.getNombre() + " : colaboradores: " + colaboradores + ", bono: " + bono ;
	}
	
	
	

	
	
	
	
	
	

}
