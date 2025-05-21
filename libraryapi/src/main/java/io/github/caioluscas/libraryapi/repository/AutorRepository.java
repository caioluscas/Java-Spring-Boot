package io.github.caioluscas.libraryapi.repository;

import io.github.caioluscas.libraryapi.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {

}
