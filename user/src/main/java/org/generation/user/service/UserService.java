package org.generation.user.service;

import java.util.ArrayList;

import org.generation.user.model.User;
import org.springframework.stereotype.Service;

//Atoda clase service  tengo que agregarle una notacion que indicara  que actuara como Servicio

@Service
public class UserService {
	
	//Vamos a intaciar un ArrayList del tipo user para simular una base de datos(DB)
	public final ArrayList <User>usuarios = new ArrayList <User>();
	
	//Método constructor
	public UserService() {
		//Instanciar objetos dentro del constructor
		usuarios.add(new User(1L,"Brandon Perez","ferrerbr@gmail.com","constraseña123"));// base de datos simulada  cuando tenemos la base de datos el dato del tipo ID se genera mediante una anotacion 
		usuarios.add(new User(2L,"Erick eduardo","erickedu@outlook.com","infinito1019"));
		usuarios.add(new User(3L,"Moni jasso","monicaNaranjo@yahoo.com","figma4567"));
		usuarios.add(new User(4L,"Mitzi Martines","mitzim@hotmail.com","1234568745"));
	}
	
	// Metodos  para relacionar el mapeo y poder acceder a la informacion  mediante el protocolo HTTP (definido en controler)
	
	public ArrayList<User> getUsuarios() {
		return usuarios;
		
	}
	
	//mas adelante , aqui existiran otros metodos  que nos permitan acceder, eliminar modificar (actualizar) obtener crear y optener po od  obtener por e mail, modificar cierta informacion entre otros 
	

}
