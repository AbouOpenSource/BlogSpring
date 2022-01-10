package com.github.abouopensource.Application.controllers;


import com.github.abouopensource.Application.Service.AuteurService;
import com.github.abouopensource.Application.models.Article;
import com.github.abouopensource.Application.models.Auteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AuteurController {
    @Autowired
    AuteurService service;
    @GetMapping("/auteurs")
    public ResponseEntity<List<Auteur>> findAll(){
        List<Auteur> auteurs = service.findAll();
        return ResponseEntity.ok().body(auteurs);
    }

    @GetMapping("/auteurs/{id}")
    public ResponseEntity<Auteur> findById(@PathVariable(value="id") Long id){
        Optional<Auteur> auteurOptional = service.findById(id);
        if(auteurOptional.isPresent()){
            return ResponseEntity.ok().body(auteurOptional.get());
        }
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/auteurs/{id}/articles")
    public ResponseEntity<List<Article>> finByIdListArticle(@PathVariable(value="id") Long id){
        List<Article> articles = service.finByIdListArticle(id);

        return ResponseEntity.ok().body(articles);
    }
}
