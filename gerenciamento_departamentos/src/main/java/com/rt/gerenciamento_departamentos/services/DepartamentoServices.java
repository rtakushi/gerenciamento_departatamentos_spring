package com.rt.gerenciamento_departamentos.services;

import com.rt.gerenciamento_departamentos.models.Departamento;
import com.rt.gerenciamento_departamentos.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoServices {

    @Autowired
    private DepartamentoRepository repository;

    public Departamento salvar(Departamento departamento){
        return repository.save(departamento);
    }

    public List<Departamento> listarTodos(){
        return repository.findAll();
    }

    public Optional<Departamento> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
