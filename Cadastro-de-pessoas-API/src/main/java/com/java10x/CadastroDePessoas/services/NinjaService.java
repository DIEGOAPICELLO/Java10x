package com.java10x.CadastroDePessoas.services;

import com.java10x.CadastroDePessoas.Repositories.NinjaRepository;
import com.java10x.CadastroDePessoas.entities.Ninja;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    @Autowired
    public NinjaRepository ninjaRepository;

    public Ninja saveNinja (Ninja ninja) {
        return ninjaRepository.save(ninja);
    }

    public List<Ninja> findAll() {
        return ninjaRepository.findAll();
    }

    public Optional<Ninja> findById(Long id) {
        return ninjaRepository.findById(id);
    }

    public Ninja updateNinja (Long id, Ninja ninjaAtalizado) {
        Ninja ninjaExistente = ninjaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Ninja não encontrado, favor verificar o ID:" + id));
        ninjaExistente.setName(ninjaAtalizado.getName());
        ninjaExistente.setAge(ninjaAtalizado.getAge());
        ninjaExistente.setEmail(ninjaAtalizado.getEmail());
        return ninjaRepository.save(ninjaExistente);
    }

    public void deleteNinja(Long id) {
        ninjaRepository.deleteById(id);
    }
}
