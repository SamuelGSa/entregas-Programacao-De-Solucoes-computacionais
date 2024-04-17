package org.example.view;

import org.example.model.Cidade;
import org.example.model.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cidade cidade1 = new Cidade();
        Cidade cidade2 = new Cidade("Porto Alegre");
        Cidade cidade3 = new Cidade(1,"Rio de Janeiro");

        System.out.println("Cidade1: " + cidade1.nome);
        System.out.println("Cidade2: id - " + cidade2.id + " - " + cidade2.nome);
        System.out.println("Cidade3: id - " + cidade3.id + " - " + cidade3.nome);

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Joao";
        cliente1.altura = 1.75;
        cliente1.casado = false;
        cliente1.cidade = cidade2;

        Cliente cliente2 = new Cliente("Joaquim Bezerra Leite");
        cliente2.altura = 1655;
        cliente2.casado = true;
        cliente2.cidade = cidade3;

        Cliente cliente3 = new Cliente(1,"Pimpolho Verdemar","Rua da Agua", 1.66,true,cidade3);

        Cliente cliente4 = new Cliente(2,"Dudu Maria","Rua verdinha - 420", 1.23,false,new Cidade("BH"));

        System.out.println("Nome do Cliente: " + cliente4.nome + " Cidade: " + cliente4.cidade.nome);

        System.out.println(cliente1.cidade);

        List<Cidade> cidades = Arrays.asList(cidade1,cidade2,cidade3);


        for (Cidade cidade : cidades){
            System.out.println("=");
            System.out.println(cidade.nome);
        }
    }
}