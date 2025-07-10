package com.java10x.CadastroDePessoas.Repositories;

import com.java10x.CadastroDePessoas.entities.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
