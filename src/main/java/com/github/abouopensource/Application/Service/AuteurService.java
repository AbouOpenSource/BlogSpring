package com.github.abouopensource.Application.Service;


import com.github.abouopensource.Application.models.Auteur;
import com.github.abouopensource.Application.repository.ArticleRepository;
import com.github.abouopensource.Application.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurService {
    @Autowired
    AuteurRepository repository;

    public List<Auteur> findAll(){
        return repository.findAll();
    }
}
