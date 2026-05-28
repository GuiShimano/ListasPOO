package com.exercicios.ex03;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    private double calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }

    public void verificarSituacao(){
        if (calcularMedia() >= 7){
            System.out.println("O aluno " + getNome() + " foi aprovado!");
        }
        else {
            System.out.println("O aluno " + getNome() + " foi reprovado!");
        }
    }
}
