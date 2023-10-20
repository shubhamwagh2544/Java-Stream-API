package com.streams.java8.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "person")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Person {
  @Id
  Integer id;
  String firstName;
  String lastName;
  String email;
  String gender;
  Integer age;
}