package com.exercicios;

import com.exercicios.ex01.*;
import com.exercicios.ex02.*;
import com.exercicios.ex03.*;
import com.exercicios.ex04.*;
import com.exercicios.ex05.*;

public class Main {
    public static void main(String[] args) {

        // Exercício 01
        System.out.println("\n----- EXERCÍCIO 01 -----\n");
        Pessoa bertoni = new Pessoa();
        bertoni.setNome("Bertoni");
        bertoni.setIdade(19);

        bertoni.exibirDados();

        System.out.println("");

        // Exercício 02
        System.out.println("----- EXERCÍCIO 02 -----\n");
        Produto prod1 = new Produto();
        prod1.setNome("Bolacha");
        prod1.setPreco(2.5);

        Produto prod2 = new Produto();
        prod2.setNome("Água");
        prod2.setPreco(2.25);

        prod1.mostrarInformacoes();
        System.out.println("");
        prod2.mostrarInformacoes();

        System.out.println("");

        // Exercício 03
        System.out.println("----- EXERCÍCIO 03 -----\n");
        Aluno gusta = new Aluno();
        gusta.setNome("Gustavo Bento Cebolitos");
        gusta.setMatricula("Matriculado");
        gusta.setNota1(8.3);
        gusta.setNota2(5.8);
        gusta.verificarSituacao();

        System.out.println("");

        // Exercício 04
        System.out.println("----- EXERCÍCIO 04 -----\n");
        Retangulo rectangle = new Retangulo();
        rectangle.setBase(2.0);
        rectangle.setAltura(3.5);
        System.out.println("A área do rectangle é: " + rectangle.calcularArea());
        System.out.println("O perímetro do rectangle é: " + rectangle.calcularPerimetro());

        System.out.println("");

        // Exercício 05
        System.out.println("----- EXERCÍCIO 05 -----\n");
        ContaBancaria superConta = new ContaBancaria();
        superConta.setNumero(1);
        superConta.setTitular("Munir Berg");
        superConta.setSaldo(0);
        superConta.depositar(250);
        superConta.sacar(400);
        superConta.sacar(120);
        System.out.println("O saldo da conta " + superConta.getNumero() + 
                           " do titular " + superConta.getTitular() + 
                           " é de RS" + superConta.consultarSaldo());

        System.out.println("");
    }
}