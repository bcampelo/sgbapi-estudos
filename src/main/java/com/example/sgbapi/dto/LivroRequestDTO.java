package com.example.sgbapi.dto;

import lombok.Data;

@Data
public class LivroRequestDTO {

    private String titulo;
    private String autor;
    private String isbn;
    private Integer anoPublicacao;
    private Integer quantidadeDisponivel;

    private long categoriaId;
}
