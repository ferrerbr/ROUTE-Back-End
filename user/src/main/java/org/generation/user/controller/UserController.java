package org.generation.user.controller;

import java.util.ArrayList;

import org.generation.user.model.User;
import org.generation.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Tengo que indicarle a springboot  que esta clase sera mi Controller, c on la notacion Rescontroler que me permite indicar que la clase es un controlador  de peticiones API (Trabaja cone el metodo del protocolo http)
//Definimos un end point que apunta a este controllador mediente la notacion @RequestMapping y rntr parentecis es endpoint que nosotros definamos  

@RestController
@RequestMapping("api/usuario01")//localhost:8080/api/uauario01/map
public class UserController {
	
	//Instanciar una variable del tipo UserService
	private final UserService userService;
	
	//Metodo constructor
	//tengo que realizar una inyeeccion de dependencias  en el constructor con la notacion @Autowired
	@Autowired
	public UserController (UserService userService) {
		this.userService = userService;
		
	}
	
	//Metodo para el  mapeo, vamos a crer un metodo que nos permite get, post , put , delet (CRUD)  y para ello vamos a utilizart difrerentes anotaciones 
	//Definir el end point especifico para este método
	//Este metodo debe hacer match con el tipo de dato del metodo que defini en UserService que es del tipo ArrayList<User>
	@GetMapping("/getAll") //localhost:8080/api/uauario01/getAll
	public ArrayList<User> getAll(){
		return  userService.getUsuarios();
		
	}
	
	
	
}
