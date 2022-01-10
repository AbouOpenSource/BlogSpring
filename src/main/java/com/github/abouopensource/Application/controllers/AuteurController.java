package com.github.abouopensource.Application.controllers;


import com.github.abouopensource.Application.Service.AuteurService;
import com.github.abouopensource.Application.models.Auteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuteurController {
    @Autowired
    AuteurService service;
    @GetMapping("/auteurs")
    public ResponseEntity<List<Auteur>> findAll(){
        List<Auteur> auteurs = service.findAll();
        return ResponseEntity.ok().body(auteurs);
                //new ResponseEntity<List<Auteur>>(ResponseEntity.status(200));
    }
}
