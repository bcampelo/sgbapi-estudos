package com.example.sgbapi.entity;

import jakarta.persistence.*;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;

    @Column(nullable = false)
    private String isbn;

    @Column(nullable = false)
    private Integer quantidadeDisponivel;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
