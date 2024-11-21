package br.com.sistemaypua.sistema_ypua.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sistemaypua.sistema_ypua.entity.Cadastrofunc;


@Repository
public interface CadastrofuncRepository extends JpaRepository<Cadastrofunc,Long>{
    
}
