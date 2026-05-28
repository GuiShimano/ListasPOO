package com.bubblesort;

public class VetorOrdenavel {

    private int[] numeros;

    public VetorOrdenavel(int[] numeros) {
        this.numeros = numeros;
    }

    public void ordenar() {
        for(int i = 0; i < numeros.length - 1; i++){
            for (int j = 0; j < numeros.length - 1 - i; j++){
                if (numeros[j] > numeros[j + 1]){
                    int buffer = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = buffer;
                }
            }
        }
    }

    public void imprimir() {
        for (int vaca : numeros) {
            System.out.print(vaca + " ");
        }
    }
}