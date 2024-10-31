package org.generation.exception;


//clase del tipo Exception  para crear mi exception que se usara en el metodo de retirar()
public class FondosInsuficientesException extends Exception {
	
	//1.Atributos
	private double saldoException;
	
	//2. Metodo constructor
	public FondosInsuficientesException(double saldoException) {
		this.saldoException = saldoException;
	}

	//3.GETTERS y SETTERS
	public double getSaldoException() {
		return saldoException;
	}
	public void setSaldoException(double fondo) {
		saldoException += fondo;
	}
	
	
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 

}
