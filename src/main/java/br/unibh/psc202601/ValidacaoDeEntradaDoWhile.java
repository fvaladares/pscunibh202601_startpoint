package br.unibh.psc202601;

import java.util.Scanner;

public class ValidacaoDeEntradaDoWhile {
    public static void main(String[] args) {
        int senhaValida = 2026;
        int senhaUsuario;
        boolean senhaInvalida = true; // false
        Scanner entrada = new Scanner(System.in);
        System.out.println("Controle de acesso");

        do {
            System.out.print("Por favor, informe sua senha: ");
            senhaUsuario = entrada.nextInt();

            if (senhaUsuario == senhaValida) {
                senhaInvalida = false;
            } else {
                System.out.println("Senha Incorreta!");
            }
        } while (senhaInvalida);

        System.out.println("Acesso Permitido");
        System.out.println("Fim do programa");
        entrada.close();
    }
}
