package org.generation.figuras;

public class Circulo  extends Figura{
	//Atributo
	private double radio;
	
	//constructor 
	public Circulo(double radio) {
		this.radio = radio;
	}
	//Metodos propios  o heredados(Metodo abastracto)
	@Override
	public double calcularArea() {
		//Pi *r2
		double area =  Math.PI*Math.pow(radio,2);
		return area;
	}
	//getters y setters 
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}

}
