package com.rt.gerenciamento_departamentos.repositories;

import com.rt.gerenciamento_departamentos.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
