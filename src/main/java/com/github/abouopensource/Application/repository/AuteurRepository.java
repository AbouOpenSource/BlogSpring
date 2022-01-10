package com.github.abouopensource.Application.repository;

import com.github.abouopensource.Application.models.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {
}
