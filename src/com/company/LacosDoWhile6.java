package com.company;

import java.util.Scanner;
//Escreva um algoritmo em Java, que leia números inteiros via teclado,
// até que o número zero seja digitado. Ao final, mostre
// na tela a média de todos os números digitados, que sejam múltiplos de 3.

public class LacosDoWhile6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num=0, soma=0, media=0;

        do {
            System.out.println("Digite um número: ");
            num = leia.nextInt();
            if (num%3 == 0 && num!=0 || num<0) {
                soma+= num;
                media+=1;
            }
        }
        while (num != 0) ;
        System.out.println("A média de todos os números múltiplos de 3 é: "+(soma/media));
    }
}
