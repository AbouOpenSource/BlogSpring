package com.github.abouopensource.Application.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "articles")
public class Article {

    @Id
    @Generated
    private Long id;
    private String titre;
    private String text;
    private Date datePublication;
}
