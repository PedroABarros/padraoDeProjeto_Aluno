package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveArmazenarEstados() {
        Aluno aluno = new Aluno();
        aluno.matricula();
        aluno.formar();
        assertEquals(2, aluno.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Aluno aluno = new Aluno();
        aluno.matricula();
        aluno.formar();
        aluno.restauraEstado(0);
        assertEquals("matriculado", aluno.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Aluno aluno = new Aluno();
        aluno.matricula();
        aluno.trancar();
        aluno.formar();
        aluno.restauraEstado(1);
        assertEquals("trancado", aluno.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Aluno aluno = new Aluno();
            aluno.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
