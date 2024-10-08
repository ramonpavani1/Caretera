package com.example.Cartera.service;

import com.example.Cartera.model.Registro;
import com.example.Cartera.model.Categoria;
import com.example.Cartera.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RegistroService {

    @Autowired
    private RegistroRepository registroRepository;

    public List<Registro> listarRegistrosPorPeriodo(LocalDate startDate, LocalDate endDate) {
        return registroRepository.findByDataBetween(startDate, endDate);
    }

    public List<Registro> listarRegistrosPorMes(int mes, int ano) {
        LocalDate startDate = LocalDate.of(ano, mes, 1);
        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());
        return listarRegistrosPorPeriodo(startDate, endDate);
    }

    public List<Registro> listarRegistrosPorAno(int ano) {
        LocalDate startDate = LocalDate.of(ano, 1, 1);
        LocalDate endDate = LocalDate.of(ano, 12, 31);
        return listarRegistrosPorPeriodo(startDate, endDate);
    }

    public List<Registro> listarRegistrosPorCategoria(Categoria categoria) {
        return registroRepository.findByCategoria(categoria);
    }

    // CRUD básico para Registro
    public Registro criarRegistro(Registro registro) {
        return registroRepository.save(registro);
    }

    public void deletarRegistro(Long id) {
        registroRepository.deleteById(id);
    }
}
