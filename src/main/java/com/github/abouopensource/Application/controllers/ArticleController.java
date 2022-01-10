package com.github.abouopensource.Application.controllers;


import com.github.abouopensource.Application.Service.ArticleService;
import com.github.abouopensource.Application.models.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ArticleController {

    @Autowired
    ArticleService service;
    @GetMapping("/articles")
    public ResponseEntity<List<Article>> findAll(){
        List<Article> articles = service.findAll();
            return ResponseEntity.ok().body(articles);
    }

    @GetMapping("/articles/{id}")
    public ResponseEntity<Article> findById(@PathVariable(value="id") Long id){
        Optional<Article> articleOptional = service.findById(id);
        if(articleOptional.isPresent()){
            return ResponseEntity.ok().body(articleOptional.get());
        }
        return ResponseEntity.noContent().build();
    }

}
