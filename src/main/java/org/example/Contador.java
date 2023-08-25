package org.example;

import java.util.Scanner;

public class Contador {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args)  {

        System.out.println("Contador Fluxo");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        try {
            contar(n1, n2);
        } catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    static void contar(int n1, int n2) throws ParametrosInvalidosException {
        if (n1 > n2){
            throw new ParametrosInvalidosException(ANSI_RED+"O segundo parâmetro deve ser maior que o primeiro!!!"+ANSI_RESET);
        }
        int contagem = n2 - n1;

        for(int i=0; i < contagem; i++){
            System.out.println("Imprmindo o numero "+i);
        }
    }
}