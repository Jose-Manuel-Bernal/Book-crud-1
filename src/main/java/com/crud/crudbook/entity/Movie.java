package com.crud.crudbook.entity;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity(name = "Movie")
@Table(name = "movie")
@Data

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tittle;

    private String genero;

}
