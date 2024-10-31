package org.generation.banco;

import org.generation.exception.FondosInsuficientesException;

public class ClientesAntiguos {
	public static void main(String[] args) {
		CuentaBancaria  juan = new CuentaBancaria(5548157265L,"Juan Perez",44000);
		
		System.out.println(juan);
		
		// ingresa 250 de una venta
		juan.ingresar(250);
		
		
		juan.consultar();
		
		try {
			//Metodo retirar
			juan.retirar(20000);
			
			
		}catch(FondosInsuficientesException e) {
			System.out.println("\u001B[31mSaldo insficiente\u001B[0m");
			
		}finally {
			juan.consultar();
			
		}
	}

}
