package com.example.Cartera.service;

import com.example.Cartera.model.Categoria;
import com.example.Cartera.model.Usuario;
import com.example.Cartera.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria criarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> listarCategorias(Usuario usuario) {
        return categoriaRepository.findByUsuario(usuario);
    }

    public void deletarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}
