package br.com.sistemaypua.sistema_ypua.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Cadastrocliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrement
    private long id;
    
}

