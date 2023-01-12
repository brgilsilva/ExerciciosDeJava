package com.company;
import java.util.Scanner;
public class LacosFor1 {

    //Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
    // onde o primeiro número deve ser menor que o segundo número. Caso contrário,
    // deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa.
    //Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.

    public static void main(String[] args) {

        int num1, num2;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o Primeiro número do intervalo: ");
        num1 = ler.nextInt();
        System.out.println("Digite o Último número do intervalo: ");
        num2 = ler.nextInt();

        if (num1 < num2) {
            for (int contador = num1; contador < num2; contador++) {
                if ((contador % 5) == 0 && (contador % 3) == 0) {
                    System.out.println(contador+" é multiplo de 5 e 3");

                }
            }
        }
         else {
            System.out.println("Intervalo Inválido!");
        }
    }


}
