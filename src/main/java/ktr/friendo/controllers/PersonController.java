package ktr.friendo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ktr.friendo.domain.Person;
import ktr.friendo.service.PersonService;


/*
 * Classe Controller
 * Responsavel pelo controle das rotas das requisições
 * 
*/
@RestController
@RequestMapping("/person")
@Api(value = "Person")  //Swagger
public class PersonController {

   @Autowired
   private PersonService personService; 

   @GetMapping
   @ApiOperation(value = "Return list of all registred persons.")
   public List<Person> getAll(){
      return this.personService.getAll();
   }

   @GetMapping("/{id}")
   @ApiOperation(value = "Return a person by id.")
   public Person getPersonById(@PathVariable Long id){
      return this.personService.getPersonById(id);
   }

   @PostMapping
   @ApiOperation(value = "add a new person.")
   public Person addPerson(@RequestBody Person person){
      return this.personService.addPerson(person);
   }

   @PutMapping("/{id}")
   @ApiOperation(value = "update a person.")
   public Person updatePerson(@PathVariable Long id, @RequestBody Person updatePerson){
      return personService.updatePerson(id, updatePerson);
   }

   @DeleteMapping("/{id}")
   @ApiOperation(value = "delete a person.")
   public void deletePerson(@PathVariable Long id){
      personService.deletePerson(id);
   }
}   
