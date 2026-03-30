package br.unibh.psc202601;

import java.util.Scanner;

public class ValidacaoEntrada2 {
    public static void main(String[] args) {
        int senhaValida = 2026;
        int senhaUsuario;
        boolean senhaInvalida = true; // false
        Scanner entrada = new Scanner(System.in);

        System.out.println("Controle de acesso");
        System.out.print("Por favor, informe sua senha: ");
        senhaUsuario = entrada.nextInt();

        if(senhaValida != senhaUsuario) {
            while (senhaInvalida) {
                System.out.println("Senha Incorreta!");
                System.out.print("\nInsira a senha novamente: ");
                senhaUsuario = entrada.nextInt();
                if(senhaValida == senhaUsuario) {
                    senhaInvalida = false;
                }
            }
        }
        System.out.println("Acesso Permitido");
        System.out.println("Fim do programa");
        entrada.close();
    }
}
