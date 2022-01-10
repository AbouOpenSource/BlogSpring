package com.github.abouopensource.Application.Service;

import com.github.abouopensource.Application.models.Article;
import com.github.abouopensource.Application.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    ArticleRepository repository;

    public List<Article> findAll(){
        return repository.findAll();
    }

    public Optional<Article> findById(Long id){
        return repository.findById(id);
    }

}
