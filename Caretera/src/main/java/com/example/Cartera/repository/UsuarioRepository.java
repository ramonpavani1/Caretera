package com.example.Cartera.repository;

import com.example.Cartera.model.Categoria;
import com.example.Cartera.model.Registro;
import com.example.Cartera.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);  // Busca por e-mail para o login
}

