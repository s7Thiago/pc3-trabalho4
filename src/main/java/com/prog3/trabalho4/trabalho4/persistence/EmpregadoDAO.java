package com.prog3.trabalho4.trabalho4.persistence;

import java.util.List;

import com.prog3.trabalho4.trabalho4.model.Empregado;

public interface EmpregadoDAO {

    public void incluir(Empregado empregado);

    public void alterar(Empregado empregado);

    public void excluir(Empregado empregado);

    public List<Empregado> listarTodos();

    public Empregado buscarPeloCpf(String cpf);

}
