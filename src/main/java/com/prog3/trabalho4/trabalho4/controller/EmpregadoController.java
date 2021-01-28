package com.prog3.trabalho4.trabalho4.controller;

import java.util.List;

import com.prog3.trabalho4.trabalho4.model.Empregado;
import com.prog3.trabalho4.trabalho4.persistence.EmpregadoDAOImpl;

public class EmpregadoController {

    public void incluir(Empregado empregado) {
        EmpregadoDAOImpl dao = new EmpregadoDAOImpl();
        dao.incluir(empregado);
    }

    public void alterar(Empregado empregado) {
        EmpregadoDAOImpl dao = new EmpregadoDAOImpl();
        dao.alterar(empregado);
    }

    public void excluir(Empregado empregado) {
        EmpregadoDAOImpl dao = new EmpregadoDAOImpl();
        dao.excluir(empregado);
    }

    public List<Empregado> listarTodos() {
        EmpregadoDAOImpl dao = new EmpregadoDAOImpl();
        return dao.listarTodos();

    }

    public Empregado buscarPeloCpf(String cpf) {
        EmpregadoDAOImpl dao = new EmpregadoDAOImpl();
        return dao.buscarPeloCpf(cpf);

    }

}
