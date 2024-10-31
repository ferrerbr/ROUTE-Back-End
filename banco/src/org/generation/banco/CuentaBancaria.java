package org.generation.banco;

import org.generation.exception.FondosInsuficientesException;

//Aqui vive mi objeto con atributos y metodos
public class CuentaBancaria {
	//1.Atributos con modificador de acceso(encapsulamiento)
	private Long idCuenta;
	private String propietario;
	private double saldo;
	
	//2.Metodo constructor
	//Solo recibe idCuentaj y propietario como parametros ya que el saldo incial es de 0  de los nuevos clientes
	public CuentaBancaria(Long idCuenta, String propietario) {
		this.idCuenta = idCuenta;
		this.propietario = propietario;
		
	}
	
	//2.1 Metodo constructor para clientes que ya tienes saldo en su cuenta bancaria
	public CuentaBancaria(Long idCuenta, String propietario,double saldo) {
		this.idCuenta =idCuenta;
		this.propietario = propietario;
		this.saldo = saldo;
		
	}
	
	
	
	//3. crear metodos especificos para la clase
	//ingresar ,retirar y cosnutltar saldo
	public void ingresar(double monto) {
		saldo += + monto;
		
	}
	
	
	//crear una excepcion: Fondos Insuficientes
	//implementer la exception utilizando la palabra reservada throws
	public void retirar(double monto) throws FondosInsuficientesException {
		if(monto <= saldo) {
			saldo -= monto;
			
		}else {
			throw new FondosInsuficientesException(saldo);
			
		}
		
	}
	
	public void consultar() {
		System.out.println("Tu saldo es de: $" + saldo);
	}

	
	
	
	//4.getters y detters

	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	//5. to String
	@Override
	public String toString() {
		return "CuentaBancaria = idCuenta:" + idCuenta + ", propietario: " + propietario + ", saldo: $" + saldo  ;
	}
	
	
	
	
	
	

}
