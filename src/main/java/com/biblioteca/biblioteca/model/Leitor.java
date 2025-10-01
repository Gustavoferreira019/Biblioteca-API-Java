package com.biblioteca.biblioteca.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "tb_leitor")
@Entity
@Data
@NoArgsConstructor
public class Leitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private String email;

    @NonNull
    private LocalDate dataEmprestimo;

    @NonNull
    private LocalDate dataDevolucao;

    @OneToMany(mappedBy = "leitor")
    private List<Livro> livros = new ArrayList<>();

}
