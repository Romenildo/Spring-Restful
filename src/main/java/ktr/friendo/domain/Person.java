package ktr.friendo.domain;


import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


/*
 * Classe Person
 * Responsavel pela entidade, onde os dados das informacoes é armazenada
 * possui os atributos da classe pessoa como nome, idade, resumo...
 */
@Document("Persons")
public class Person implements Serializable{
    
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    private String name;
    private int age;
    private String birthday;
    private String summary;

    List<String> infos;



}
