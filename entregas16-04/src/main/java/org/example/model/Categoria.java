package org.example.model;

public class Categoria {

    public int id;
    public String nome;

    public Categoria() {
        this.id = id = 0;
        this.nome = "Belo Horizonte";
    }

    public Categoria(String nome) {
        this.id = 0;
        this.nome = nome;
    }


    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
