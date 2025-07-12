package com.java10x.CadastroDePessoas.services;

import com.java10x.CadastroDePessoas.Repositories.MissoesRepository;
import com.java10x.CadastroDePessoas.entities.Missoes;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {
    @Autowired
    public MissoesRepository missoesRepository;

    public Missoes saveMissoes(Missoes missoes){
        return missoesRepository.save(missoes);
    }

    public List<Missoes> findAll (){
        return missoesRepository.findAll();
    }

    public Optional<Missoes> findById(Long id) {
        return missoesRepository.findById(id);
    }

    public Missoes updateMission (Long id, Missoes atualizaMissao) {
        Missoes missaoExistente = missoesRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Missão não encontrada, verifique o ID:" + id));
        missaoExistente.setName(atualizaMissao.getName());
        missaoExistente.setDificuldadeMissao(atualizaMissao.getDificuldadeMissao());
        return missoesRepository.save(missaoExistente);
    }

    public void deleteMissao(Long id) {
        missoesRepository.deleteById(id);
    }
}
