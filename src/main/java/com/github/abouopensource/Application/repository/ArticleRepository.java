package com.github.abouopensource.Application.repository;

import com.github.abouopensource.Application.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
