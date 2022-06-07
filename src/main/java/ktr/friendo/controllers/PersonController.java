package ktr.friendo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ktr.friendo.domain.Person;


/*
 * Classe Controller
 * Responsavel pelo controle das rotas das requisições
 * 
*/
@RestController
@RequestMapping("/Persons")
public class PersonController {

    
   @GetMapping
   public void getAll(){}

   @GetMapping("/{id}")
   public void getPersonById(@PathVariable Long id){}

   @PostMapping
   public void addPerson(@RequestBody Person person){}

   @PatchMapping("/{id}")
   public void updatePerson(@PathVariable Long id, @RequestBody Person updatePerson){}

   @DeleteMapping("/{id}")
   public void deletePerson(@PathVariable Long id){}
}   
