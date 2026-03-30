package br.unibh.psc202601;

import java.util.Scanner;

public class ValidacaoDeEntrada {
    public static void main(String[] args) {
        int senhaValida = 2026;
        int senhaUsuario;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Controle de acesso");
        System.out.print("Por favor, informe sua senha: ");
        senhaUsuario = entrada.nextInt();

        while (senhaUsuario != senhaValida) {
            System.out.println("Senha Incorreta!");
            System.out.print("\nInsira a senha novamente: ");
            senhaUsuario = entrada.nextInt();
        }

        System.out.println("Acesso Permitido");
        System.out.println("Fim do programa");
    }
}
