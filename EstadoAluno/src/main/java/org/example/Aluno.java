package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String estado;
    private List<String> salvarEstados = new ArrayList<>();

    public Aluno() {
        this.estado = "não matriculado";
    }

    public void matricula() {
        if (estado.equals("não matriculado")) {
            salvarEstado();
            estado = "matriculado";
        }
    }

    public void trancar() {
        if (estado.equals("matriculado")) {
            salvarEstado();
            estado = "trancado";
        }
    }

    public void formar() {
        if (estado.equals("matriculado")) {
            salvarEstado();
            estado = "formado";
        }
    }

    public void jubilar() {
        if (estado.equals("formado")) {
            salvarEstado();
            estado = "jubileu";
        }
    }

    public void evadir() {
        if (estado.equals("matriculado") || estado.equals("trancado")) {
            salvarEstado();
            estado = "evadido";
        }
    }

    public void transferir() {
        if (estado.equals("matriculado") || estado.equals("trancado")) {
            salvarEstado();
            estado = "transferido";
        }
    }

    public void restauraEstado(int indice) {
        if (indice >= 0 && indice < salvarEstados.size()) {
            estado = salvarEstados.get(indice);
        } else {
            throw new IllegalArgumentException("Índice inválido");
        }
    }


    public List<String> getEstados() {
        return new ArrayList<>(salvarEstados);
    }

    public String getEstado() {
        return estado;
    }

    public void salvarEstado() {
        salvarEstados.add(estado);
    }
}

