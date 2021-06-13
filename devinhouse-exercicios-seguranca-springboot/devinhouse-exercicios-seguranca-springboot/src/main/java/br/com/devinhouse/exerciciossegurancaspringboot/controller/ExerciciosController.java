package br.com.devinhouse.exerciciossegurancaspringboot.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciciosController {

	@GetMapping(path = "/exercicios")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("Bem vindo aos nossos exercicios sobre Autorização e Autenticação de uma aplicação Client");
	}

	@RolesAllowed("usuario-funcionario")
	@GetMapping("/role/user")
	public ResponseEntity<String> usuariosDaRoleUser(){
		return ResponseEntity.ok("Usuários da Role user");
	}

	@RequestMapping(value = "/anonymous", method = RequestMethod.GET)
	public ResponseEntity<String> getAnonymous() {
		return ResponseEntity.ok("Hello Anonymous");
	}

	@RolesAllowed("user")
	@GetMapping(value = "/user")
	public ResponseEntity<String> getUser() {
		return ResponseEntity.ok("Hello User");
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ResponseEntity<String> getAdmin() {
		return ResponseEntity.ok("Hello Admin");
	}

	@RequestMapping(value = "/all-user", method = RequestMethod.GET)
	public ResponseEntity<String> getAllUser() {
		return ResponseEntity.ok("Hello All User");
	}
}
