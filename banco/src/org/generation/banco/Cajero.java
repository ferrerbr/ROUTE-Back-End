package org.generation.banco;

import org.generation.exception.FondosInsuficientesException;

public class Cajero {
	public static void main(String[] args) {
		CuentaBancaria  brandon =new CuentaBancaria(54815L,"Brandon Ferrer");
		System.out.println(brandon);
		
		//Deposito de la nomina
		brandon.ingresar(17000);
		//consultar
		brandon.consultar();
		brandon.ingresar(500);
		brandon.consultar();
		
		//el metodo retirar debe ir ligado a una excepcion
		try {
			//Metodo retirar
			brandon.retirar(20000);
			
			
		}catch(FondosInsuficientesException e) {
			System.out.println("\u001B[31mSaldo insficiente\u001B[0m");
			
		}finally {
			brandon.consultar();
			
		}

	}

}
