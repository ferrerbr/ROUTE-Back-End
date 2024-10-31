package org.generation.employee;
//Las interfaces son constratos que las clases deben cumplir que cualquier coasa que 'implemente ' una interfaze debe proporcionar  una implementacion para todos sus metodos

//Una interfaz en java es una colecion de metodos abstractos ypropiedades cosntantes

//Las interfazes se deben inplemtar  en las clse donde  utilizaremos los metodos  usando la parabla implemets seguid de el nombre de la interfaze.Tengo que 'anotar' cuales son las clases de  la interfaz que se esta implementando (@Override)
public interface Trabajador {
	
	void trabajar();
	void calcularSalario();
	

}
