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
public class Cadastrofunc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrement
    private long id;
    private String name;
    private String  telefone;
    private String email;
    private String endereço;
    private String cpf;
    private String cadastrar;
    public void setadicionar(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setadicionar'");
    }
    
}
