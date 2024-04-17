package org.example.model;


public class Cliente {

    public int id;
    public String nome;
    public String endereco;

    public double altura;
    public boolean casado;

    public  Cidade cidade;

    public Cliente() {
        this.nome = "Seu Nome";
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(int id, String nome, String endereco, double altura, boolean casado, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.altura = altura;
        this.casado = casado;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", altura=" + altura +
                ", casado=" + casado +
                ", cidade=" + cidade +
                '}';
    }
}
