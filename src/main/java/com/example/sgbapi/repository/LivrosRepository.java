package com.example.sgbapi.repository;

import com.example.sgbapi.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


// Pq interface? Pois não implementamos nada

                                // Crie um repo do tipo livro, cujo o id é do tipo long
public interface LivrosRepository extends JpaRepository<Livro, Long> {
    Optional<Livro> findByIsbn(String isbn);

    boolean existsByIsbn(String isbn);
}
