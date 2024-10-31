package org.generation.excepciones;

//En esta clase escribire el metodo para realizar ina divicio entre dos numeros y el metodo  para instanciar objetos (main)

public class DivisionMain {
	
	//Metodos que nos permite dividir dos numeros
	// la palabra static le indica que el metodo pertenece a esta clase  de otra forma dentro del metodo main deberiamos crear un metodo ne division main DivisionMain division =new Divsion,Main()
	public static double division(double numero1, double numero2) {
		return numero1/numero2;
		
	}
	
	public static int divisionE(int numero1, int numero2) {
		return numero1/numero2;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(division(10,5)); //Output: 2.0
		System.out.println(division(10,0)); //Output: Infinity
		System.out.println(division(0,5));  //Output: 0
		
		//System.out.println(divisionE(20,0));  //Output: Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		
		
		//--Manejando excepciones
		//--El try se ejecuta hata que sucede una excepcion en ese mometo pasa a ejecutar el catch
		try{
			System.out.println("\u001B[32mInicio del programa");
			int resultado =divisionE(50,0);
			System.out.println("El resultado de la division es: " + resultado);
			
		}catch(ArithmeticException e){
			System.out.println("\u001B[31mLa division tienede a infinito \u001B[0m");
			
		}finally {
			System.out.println("\u001B[32mPrograma finalizado");
		}
		
		
		
		
		
	}

}
