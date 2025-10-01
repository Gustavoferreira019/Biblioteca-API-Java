package com.biblioteca.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Table(name = "tb_livro")
@Entity
@Data
@NoArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NonNull
    private String titulo;
    @NonNull
    private String escritor;
    @NonNull
    private String sinopse;
    @NonNull
    private String capa;


    @ManyToOne
    @JoinColumn(name = "leitor_id")
    private Leitor leitor;
}
