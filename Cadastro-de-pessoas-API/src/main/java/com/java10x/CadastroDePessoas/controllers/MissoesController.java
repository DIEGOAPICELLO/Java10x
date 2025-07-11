package com.java10x.CadastroDePessoas.controllers;

import com.java10x.CadastroDePessoas.entities.Missoes;
import com.java10x.CadastroDePessoas.services.MissoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @Autowired
    private MissoesService missoesService;

    @GetMapping
    public List<Missoes> findAll() {
        return missoesService.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Missoes> findById(@PathVariable Long id) {
        return missoesService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Missoes> saveMissao (@RequestBody Missoes missoes) {
        Missoes savedMissoes = missoesService.saveMissoes(missoes);
        return ResponseEntity.ok(savedMissoes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMissao (@PathVariable Long id) {
        missoesService.findById(id);
        return ResponseEntity.noContent().build();
    }

}
