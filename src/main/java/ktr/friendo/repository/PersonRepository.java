package ktr.friendo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ktr.friendo.domain.Person;

/*
 * Classe Repository
 * Responsavel pela comunicação com o banco de dados
 * possui implementado já as principais funções de chamadas ao banco de dados
 * 
 */
public interface PersonRepository extends MongoRepository<Person, Long>{

}
