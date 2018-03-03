package com.crud.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spring.model.Usuario;
import com.crud.spring.service.UsuarioService;
//import com.boraji.tutorial.spring.service.BookService;

@RestController
public class UsuarioController {

   @Autowired
   private UsuarioService usuarioService;

   /*---Add new book---*/
   @PostMapping("/usuario")
   public ResponseEntity<?> save(@RequestBody Usuario usario) {
      long id = usuarioService.save(usario);
      return ResponseEntity.ok().body("New Book has been saved with ID:" + id);
   }

   /*---Get a book by id---*/
   @GetMapping("/book/{id}")
   public ResponseEntity<Usuario> get(@PathVariable("id") long id) {
      Usuario usuario = usuarioService.get(id);
      return ResponseEntity.ok().body(usuario);
   }

   /*---get all books---*/
   @GetMapping("/book")
   public ResponseEntity<List<Usuario>> list() {
      List<Usuario> usuario = usuarioService.list();
      return ResponseEntity.ok().body(usuario);
   }

   /*---Update a book by id---*/
   @PutMapping("/book/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Usuario usuario) {
      usuarioService.update(id, usuario);
      return ResponseEntity.ok().body("Book has been updated successfully.");
   }

   /*---Delete a book by id---*/
   @DeleteMapping("/book/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      usuarioService.delete(id);
      return ResponseEntity.ok().body("Book has been deleted successfully.");
   }
}