package br.unibh.psc202601;

import java.util.Scanner;

public class ClassificacaoDePessoasEleitoras {

    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Sistema de classificação eleitoral\n\n");
        System.out.print("Informe a idade: ");

        idade = entrada.nextInt();

        if (idade < 16) {
            exibirMensagem("Não é eleitor");
        } else if (idade >= 18 && idade < 66) {
            exibirMensagem("Eleitor obrigatório");
        } else {
            exibirMensagem("Eleitor facultativo");
        }

    }

    public static void exibirMensagem(String mensagem) {
        System.out.println(mensagem + "\n");
    }
}
