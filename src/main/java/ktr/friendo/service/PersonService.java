package ktr.friendo.service;

import java.util.List;

import ktr.friendo.domain.Person;

/*
 * Classe Service
 * Responsavel pelas regras de negocio
 * Uma camada intermediaria entre o controller e o banco de dados no repository
 * Possui as pricnipais funcoes de manipulação de chamadas do repository como add, pegar, listar, deletar
 * 
 */
public interface PersonService {
    
    public List<Person> getAll();

    public Person getPersonById(Long id);

    public Person createPerson(Person person);
}
