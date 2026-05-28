package com.exercicios.ex05;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public int getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    public double consultarSaldo(){
        return this.saldo;
    }
}