package com.github.abouopensource.Application.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "auteurs")
public class Auteur {

    @Id
    @Generated
    private Long id;
    private String nom;
    private String prenom;


    @OneToMany()
    private Set<Article> articles;


}
