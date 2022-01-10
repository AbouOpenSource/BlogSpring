package com.github.abouopensource.Application.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

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


}
