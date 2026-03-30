package br.unibh.psc202601;

import java.util.Scanner;

public class TabuadaDeUmNumeroInteiro {
    public static void main(String[] args) {
        int numeroBase;
        Scanner teclado = new Scanner(System.in);

        System.out.println(".:| Tabuada de um número informado |:.");
        System.out.print("Por favor, informe um número inteiro: ");
        numeroBase = teclado.nextInt(); //7

        for (int i = 1; i < 11; i++) {
            System.out.printf("\n %3d x %2d = %3d",
                    numeroBase,
                    i,
                    i * numeroBase);
        }
        System.out.println("\n\n.:| Fim do programa |:.");
    }
}
