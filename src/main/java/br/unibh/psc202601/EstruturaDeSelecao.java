package br.unibh.psc202601;

import java.util.Scanner;

public class EstruturaDeSelecao {
    public static void main(String[] args) {
        int cod;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o código do produto: ");
        cod = entrada.nextInt();
        System.out.println();

        // Estrutura de seleção, compara a variável cod com um dos casos listados abaixo.
        // Se não encontra coincidência, o default será executado.K
        switch (cod) {
            case 1:
                System.out.println("Alimento não perecível");
                break;
            case 2:
                System.out.println("Alimento perecível");
                break;
            case 3:
                System.out.println("Vestuário");
                break;
            case 4:
                System.out.println("Limpeza");
                break;
            default:
                System.out.println("Produto não existente");
                break;
        }
    }
}
