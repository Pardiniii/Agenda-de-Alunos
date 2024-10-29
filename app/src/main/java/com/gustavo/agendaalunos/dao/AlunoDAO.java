package com.gustavo.agendaalunos.dao;

import com.gustavo.agendaalunos.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private final static List<Aluno> alunos = new ArrayList<>();

    public void salva(Aluno alunoCriado) {
        alunos.add(alunoCriado);
    }

    public List<Aluno> todos(){
        return new ArrayList<>(alunos);
    }
}
