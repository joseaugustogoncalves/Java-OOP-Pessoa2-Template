package com.example;

public class Main {
    public static void main(String[] args) {
        // Criando uma nova Pessoa
        Pessoa pessoa = new Pessoa("João", 20);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("É maior de idade? " + (pessoa.isMaiorDeIdade() ? "Sim" : "Não"));
    
        Pessoa pessoa2 = new Pessoa("João", 20);
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("É maior de idade? " + (pessoa2.isMaiorDeIdade() ? "Sim" : "Não"));
    
        Pessoa pessoa3 = new Pessoa("João", 20);
        System.out.println("Nome: " + pessoa3.getNome());
        System.out.println("Idade: " + pessoa3.getIdade());
        System.out.println("É maior de idade? " + (pessoa3.isMaiorDeIdade() ? "Sim" : "Não"));
        Pessoa pessoa4 = new Pessoa("João", 20);
        Pessoa pessoa5 = new Pessoa("João", 20);
    }
}
