package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.model.Livro;
import com.biblioteca.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivroController {

    @Autowired
    private LivroRepository repository;

    @GetMapping
    private List<Livro> todosLivros(){
        return repository.findAll();
    }

}
