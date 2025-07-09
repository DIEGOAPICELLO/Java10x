package com.java10x.CadastroDePessoas.entities;

import com.java10x.CadastroDePessoas.enums.StatusAtendimento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Enum<StatusAtendimento> statusAtendimentoEnum;

    private Pessoa pessoa;



}
