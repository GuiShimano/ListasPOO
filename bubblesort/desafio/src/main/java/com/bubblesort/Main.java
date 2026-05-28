package com.bubblesort;

public class Main {
    public static void main(String[] args) {

        int[] vetorNormal = {1, 4, 7, 6, 3, 2, 8, 9, 18, 67, 12};
        VetorOrdenavel superVetor = new VetorOrdenavel(vetorNormal);

        System.out.println("Vetor antes da ordenação:");
        superVetor.imprimir();

        System.out.println("\n\nVetor depois da ordenação:");
        superVetor.ordenar();
        superVetor.imprimir();
    }
}