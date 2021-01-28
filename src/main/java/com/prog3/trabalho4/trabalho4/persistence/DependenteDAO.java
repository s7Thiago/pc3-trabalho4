package com.prog3.trabalho4.trabalho4.persistence;

import java.util.List;

import com.prog3.trabalho4.trabalho4.model.Dependente;

public interface DependenteDAO {
    public void incluir(Dependente dependente);

    public void alterar(Dependente dependente);

    public void excluir(Dependente dependente);

    public List<Dependente> listarTodos();

}
