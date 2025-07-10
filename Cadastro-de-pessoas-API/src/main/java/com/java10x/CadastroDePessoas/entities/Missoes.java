package com.java10x.CadastroDePessoas.entities;

import com.java10x.CadastroDePessoas.enums.DificuldadeMissao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_cadastroAtendimento")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Missoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Enum<DificuldadeMissao> dificuldadeMissaoEnum;

    private Ninja ninja;

    //OneToMany uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<Ninja> ninjaList;

}
