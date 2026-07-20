package com.example.sgbapi.mapper;

import com.example.sgbapi.dto.CategoriaResponseDTO;
import com.example.sgbapi.dto.LivroRequestDTO;
import com.example.sgbapi.dto.LivroResponseDTO;
import com.example.sgbapi.entity.Livro;

public class LivroMapper {

    // Aqui vamos pegar cada item do objeto LIVRO(entity) e vamos passar ele para cada OBJETO
    // de LivroRequestDTO -> Justamente para passar os parametros para uma DTO onde vai poder
    // ser lida pelo o Usuario apos passar para a RESPONSE!
    public Livro dtoEntity(LivroRequestDTO dto) {
        Livro livro = new Livro();
        livro.setTitulo(dto.getTitulo());
        livro.setAutor(dto.getAutor());
        livro.setIsbn(dto.getIsbn());
        livro.setQuantidadeDisponivel(dto.getQuantidadeDisponivel());
        livro.setAnoPublicacao(dto.getAnoPublicacao());

        return livro;
    }

    public LivroResponseDTO entityToDto(Livro livro){
        LivroResponseDTO dto = new LivroResponseDTO();
        dto.setId(livro.getId());
        dto.setIsbn(livro.getIsbn());
        dto.setAutor(livro.getAutor());
        dto.setAnoPublicacao(livro.getAnoPublicacao());
        dto.setTitulo(livro.getTitulo());
        dto.setCategoriaNome(livro.getCategoria().getNome());

        return dto;
    }
}
