package br.unibh.psc202601;

import java.util.Scanner;

// Nome da classe;
public class Exercicio01 {
    // Ponto de partida da execução do código;
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner input = new Scanner(System.in);
        int caixaA;
        int caixaB;
        int cargaTotal;
        int limiteCarga;

        System.out.println("Sistema de segurança do elevador");
        System.out.println();
        System.out.print("Informe o peso da primeira caixa: ");
        caixaA = input.nextInt();

        System.out.print("\nInforme o peso da segunda caixa: ");
        caixaB = input.nextInt();
        cargaTotal = caixaA + caixaB;

        System.out.print("Informe o limite de peso " +
                "suportado pelo elevador");
        limiteCarga = input.nextInt();

        if (cargaTotal < limiteCarga) {
            System.out.printf("\nSoma (%d) é menor que o " +
                            "limite (%d). Operação segura",
                    cargaTotal,
                    limiteCarga);
        } else {
            System.out.printf("\nSoma (%d) é maior ou igual ao " +
                            "limite (%d). Alerta de sobrecarga!.",
                    cargaTotal,
                    limiteCarga);
        }

        input.close();
        // Lógica do programa (entrada -> processamento -> saída)
    }
}

