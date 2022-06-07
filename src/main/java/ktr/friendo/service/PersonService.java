package ktr.friendo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ktr.friendo.domain.Person;
import ktr.friendo.repository.PersonRepository;

/*
 * Classe Service
 * Responsavel pelas regras de negocio
 * Uma camada intermediaria entre o controller e o banco de dados no repository
 * Possui as pricnipais funcoes de manipulação de chamadas do repository como add, pegar, listar, deletar
 * 
 */
@Service
public class PersonService {
    
    //injeção de dependencias
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAll(){
        return this.personRepository.findAll();
    }

    public Person getPersonById(Long id){
        return this.personRepository
                .findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Person does not exist"));
    }

    public Person addPerson(Person person){
        return this.personRepository.save(person);
    }

    public Person updatePerson(Long id, Person person){
        person.setId(id);
        return personRepository.save(person);
    }

    public void deletePerson(Long id){
        this.personRepository.deleteById(id);
    }
}

/*Injeção de dependencias
 * Serve para declarar as propriedades do repository 
 * mantendo um baixo nivel de acoplamento com o repository deixando cada dependencia em seu devido local
 * 
 */
