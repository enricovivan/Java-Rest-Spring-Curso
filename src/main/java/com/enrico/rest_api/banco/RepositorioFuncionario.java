package com.enrico.rest_api.banco;

import com.enrico.rest_api.entidade.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioFuncionario extends JpaRepository<Funcionario,Long>{
    
}
