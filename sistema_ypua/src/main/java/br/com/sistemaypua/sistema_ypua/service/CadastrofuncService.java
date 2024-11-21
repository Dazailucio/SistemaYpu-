package br.com.sistemaypua.sistema_ypua.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistemaypua.sistema_ypua.entity.Cadastrofunc;

import br.com.sistemaypua.sistema_ypua.repository.CadastrofuncRepository;
@Service
public class CadastrofuncService{
    @Autowired
    private CadastrofuncRepository cadastrofuncRepository;

    // Cadastrar um novo recado
    public Cadastrofunc insertNew(Cadastrofunc cadastrofunc){
        cadastrofunc.setadicionar("adicionado");
        return cadastrofuncRepository.save(cadastrofunc);
    }


    // Deletar um recado
    public Boolean deleteById(Long id) {
        // Use o método findById do repositório para buscar pelo ID
        if (cadastrofuncRepository.findById(id).isPresent()) {
            // Use o método deleteById do repositório para deletar pelo ID
            cadastrofuncRepository.deleteById(id);
            return true;
        } else {
            return false; // Retorne false se o ID não for encontrado
        }
    }
}


