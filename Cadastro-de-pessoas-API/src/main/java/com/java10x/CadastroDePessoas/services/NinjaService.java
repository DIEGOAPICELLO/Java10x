package com.java10x.CadastroDePessoas.services;

import com.java10x.CadastroDePessoas.Repositories.NinjaRepository;
import com.java10x.CadastroDePessoas.entities.Ninja;
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

    public void deleteNinja(Long id) {
        ninjaRepository.deleteById(id);
    }
}
