package com.gustavo.agendaalunos.dao;

import androidx.annotation.Nullable;

import com.gustavo.agendaalunos.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private final static List<Aluno> alunos = new ArrayList<>();
    private static int contadorDeId = 1;

    public void salva(Aluno alunoCriado) {
        alunoCriado.setId(contadorDeId);
        alunos.add(alunoCriado);
        atualizaIds();
    }

    private static void atualizaIds() {
        contadorDeId++;
    }

    public void edita(Aluno aluno) {
        Aluno alunoEcontrado = buscaAlunoPeloId(aluno);
        if (alunoEcontrado != null) {
            int posicaoDoAluno = alunos.indexOf(alunoEcontrado);
            alunos.set(posicaoDoAluno, aluno);
        }

    }

    @Nullable
    private Aluno buscaAlunoPeloId(Aluno aluno) {
        Aluno alunoEcontrado = null;
        for (Aluno a :
                alunos) {
            if (a.getId() == aluno.getId()) {
                return a;   //alunoEcontrado = a;
            }
        }
        return null;        //return alunoEcontrado;
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
