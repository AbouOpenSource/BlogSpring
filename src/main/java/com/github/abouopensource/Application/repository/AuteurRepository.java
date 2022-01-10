package com.github.abouopensource.Application.repository;

import com.github.abouopensource.Application.models.Article;
import com.github.abouopensource.Application.models.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {

    // TODO ; Solve the problem
    @Query("SELECT an from articles an where an.auteur = :id")
    public List<Article> findByIdArticles(Long id);
}
