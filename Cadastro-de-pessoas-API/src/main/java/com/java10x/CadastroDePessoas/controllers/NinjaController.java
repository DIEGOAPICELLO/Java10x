package com.java10x.CadastroDePessoas.controllers;

import com.java10x.CadastroDePessoas.entities.Ninja;
import com.java10x.CadastroDePessoas.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping
    public List<Ninja> findAll() {
        return ninjaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ninja> findById(@PathVariable Long id) {
        return ninjaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Ninja> saveNinja (@Validated @RequestBody Ninja ninja) {
        Ninja savedNinja = ninjaService.saveNinja(ninja);
        return ResponseEntity.ok(savedNinja);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNinja (@PathVariable Long id) {
        ninjaService.deleteNinja(id);
        return ResponseEntity.noContent().build();
    }
}
