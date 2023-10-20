package com.streams.java8.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "car")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Car {
  @Id
  private Integer id;
  private String make;
  private String model;
  private String color;
  private Integer year;
  private Double price;
}
