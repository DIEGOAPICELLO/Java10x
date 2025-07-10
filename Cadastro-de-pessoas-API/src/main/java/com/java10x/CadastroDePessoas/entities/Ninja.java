package com.java10x.CadastroDePessoas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "tb_cadatro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private Integer age;

    //@ManyToOne uma pessoa tem um unico atendimento.
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    List<Missoes> missoesList;

}
