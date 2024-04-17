package org.example.model;

public class Produto {

    public int id;
    public  String  nome;
    public  double preco;
    public  double quantidade;
    public  Categoria categoria;

    public Produto() {
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(int id, String nome, double preco, double quantidade, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }
}
