package com.rt.gerenciamento_departamentos.controllers;

import com.rt.gerenciamento_departamentos.models.Departamento;
import com.rt.gerenciamento_departamentos.services.DepartamentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoServices services;

    @PostMapping
    public Departamento criar(@RequestBody Departamento departamento){
        return services.salvar(departamento);
    }

    @GetMapping
    public List<Departamento> listar(){
        return services.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Departamento> buscar(@PathVariable Long id){
        return services.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        services.deletar(id);
    }
}
