package org.example.model;

public class Cidade {

    public int id;
    public String nome;

    public Cidade() {
        this.id = id = 0;
        this.nome = "Belo Horizonte";
    }

    public Cidade(String nome) {
        this.id = 0;
        this.nome = nome;
    }


    public Cidade(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
