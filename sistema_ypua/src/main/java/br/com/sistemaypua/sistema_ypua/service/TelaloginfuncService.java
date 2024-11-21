package br.com.sistemaypua.sistema_ypua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistemaypua.sistema_ypua.entity.Telaloginfunc;
import br.com.sistemaypua.sistema_ypua.repository.TelaloginfuncRepository;
@Service
public class TelaloginfuncService {
    @Autowired
    private TelaloginfuncRepository telaloginfuncRepository;

  
    public Telaloginfunc findById(Long id){
        return telaloginfuncRepository.findById(id).orElse(null);
        
    }

    public Telaloginfunc insertNew(Telaloginfunc telaloginfunc){
        telaloginfunc.setCadastrar("Logando");
        return telaloginfuncRepository.save(telaloginfunc);
        
    }

    public Boolean deleteById(Long id) {
        // Use o método findById do repositório para buscar pelo ID
        if (telaloginfuncRepository.findById(id).isPresent()) {
            // Use o método deleteById do repositório para deletar pelo ID
            telaloginfuncRepository.deleteById(id);
            return true;
        } else {
            return false; // Retorne false se o ID não for encontrado
        }
    }
}
