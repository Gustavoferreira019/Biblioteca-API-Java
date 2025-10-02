package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.model.Livro;
import com.biblioteca.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public List<Livro> todosLivros(){
        return repository.findAll();
    }

    public Livro encontrarPeloTitulo(String tituloLivro){
        return repository.findByTituloContainingIgnoreCase(tituloLivro);
    }
}
