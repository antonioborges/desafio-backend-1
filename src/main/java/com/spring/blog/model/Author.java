package com.spring.blog.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "authors")
public class Author {
  
  // TODO com os campos id (long auto incremento), name (string) e createdAt (LocalDate), e seus métodos getters, setters, toString, hashCode e equals

}
