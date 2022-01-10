package com.github.abouopensource.Application.controllers;


import com.github.abouopensource.Application.Service.ArticleService;
import com.github.abouopensource.Application.models.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    ArticleService service;
    @GetMapping("/articles")
    public ResponseEntity<List<Article>> findAll(){
        List<Article> articles = service.findAll();
            return ResponseEntity.ok().body(articles);

    }
}
