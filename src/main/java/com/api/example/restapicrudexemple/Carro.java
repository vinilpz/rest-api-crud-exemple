package com.api.example.restapicrudexemple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String modelo;
    String marca;
    Integer ano;
}
