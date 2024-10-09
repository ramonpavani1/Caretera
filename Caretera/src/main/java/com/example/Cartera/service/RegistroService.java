package com.example.Cartera.service;

import com.example.Cartera.model.Registro;
import com.example.Cartera.model.Categoria;
import com.example.Cartera.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService {

    @Autowired
    private RegistroRepository registroRepository;

    public Registro criarRegistro(Registro registro) {
        return registroRepository.save(registro);
    }

    public List<Registro> listarRegistrosPorMes(int mes, int ano) {
        // Implementar a lógica de filtragem por mês e ano
        return registroRepository.findAll(); // Temporário
    }

    public List<Registro> listarRegistrosPorAno(int ano) {
        // Implementar a lógica de filtragem por ano
        return registroRepository.findAll(); // Temporário
    }

    public List<Registro> listarRegistrosPorCategoria(Categoria categoria) {
        // Implementar a lógica de filtragem por categoria
        return registroRepository.findAll(); // Temporário
    }

    public void deletarRegistro(Long id) {
        registroRepository.deleteById(id);
    }
}
