package com.example.Cartera.controller;

import com.example.Cartera.model.Registro;
import com.example.Cartera.model.Categoria;
import com.example.Cartera.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registros")
public class RegistroController {

    @Autowired
    private RegistroService registroService;

    @GetMapping("/mes")
    public List<Registro> listarRegistrosPorMes(@RequestParam int mes, @RequestParam int ano) {
        return registroService.listarRegistrosPorMes(mes, ano);
    }

    @GetMapping("/ano")
    public List<Registro> listarRegistrosPorAno(@RequestParam int ano) {
        return registroService.listarRegistrosPorAno(ano);
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<Registro> listarRegistrosPorCategoria(@PathVariable Long categoriaId) {
        Categoria categoria = new Categoria();
        categoria.setId(categoriaId);
        return registroService.listarRegistrosPorCategoria(categoria);
    }

    @PostMapping
    public Registro criarRegistro(@RequestBody Registro registro) {
        return registroService.criarRegistro(registro);
    }

    @DeleteMapping("/{id}")
    public void deletarRegistro(@PathVariable Long id) {
        registroService.deletarRegistro(id);
    }
}
