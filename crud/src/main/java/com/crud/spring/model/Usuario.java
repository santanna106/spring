package com.crud.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tUsuario")
public class Usuario {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nome;
   private String login;
   private String senha;
   private String email;
   
   
   public Long getId() {
		return id;
   }
   
   public void setId(Long id) {
		this.id = id;
   }
   
   public String getNome() {
		return nome;
   }
   
   public void setNome(String nome) {
		this.nome = nome;
   }
   
   public String getLogin() {
		return login;
   }
   
   public void setLogin(String login) {
		this.login = login;
   }
	
   public String getSenha() {
		return senha;
   }
   
   public void setSenha(String senha) {
		this.senha = senha;
   }
   
   public String getEmail() {
		return email;
   }
   
   public void setEmail(String email) {
		this.email = email;
   }
	   
}