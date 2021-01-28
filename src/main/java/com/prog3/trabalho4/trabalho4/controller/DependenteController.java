package com.prog3.trabalho4.trabalho4.controller;

import java.util.List;

import com.prog3.trabalho4.trabalho4.model.Dependente;
import com.prog3.trabalho4.trabalho4.persistence.DependenteDAOImpl;

public class DependenteController {

    public void incluir(Dependente dependente) {
        DependenteDAOImpl dao = new DependenteDAOImpl();
        dao.incluir(dependente);
    }

    public void alterar(Dependente dependente) {
        DependenteDAOImpl dao = new DependenteDAOImpl();
        dao.alterar(dependente);
    }

    public void excluir(Dependente dependente) {
        DependenteDAOImpl dao = new DependenteDAOImpl();
        dao.excluir(dependente);
    }

    public List<Dependente> listarTodos() {
        DependenteDAOImpl dao = new DependenteDAOImpl();
        return dao.listarTodos();

    }

}
