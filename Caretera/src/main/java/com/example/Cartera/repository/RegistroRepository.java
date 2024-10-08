package com.example.Cartera.repository;

import com.example.Cartera.model.Registro;
import com.example.Cartera.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
    List<Registro> findByDataBetween(LocalDate startDate, LocalDate endDate);
    List<Registro> findByCategoria(Categoria categoria);
}
