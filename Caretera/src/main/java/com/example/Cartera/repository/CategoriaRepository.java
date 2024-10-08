package com.example.Cartera.repository;

import com.example.Cartera.model.Categoria;
import com.example.Cartera.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findByUsuario(Usuario usuario);
}
