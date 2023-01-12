package com.company;
import java.util.Scanner;
public class LacosWhile3 {
    public static void main(String[] args) {
        //Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
        // via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e
        // o total de pessoas cuja idade seja maior que 50 anos.
        // A leitura dos dados deve ser finalizada ao digitar uma idade negativa.

        int idade=0, contador=0, maior=0, menor=0;

        Scanner leia = new Scanner(System.in);


        while (idade >-1) {
            System.out.println("Digite uma idade: ");
            idade = leia.nextInt();
            if (idade >0 && idade <21) {
                menor += 1;
            }
            if (idade > 50) {
                maior += 1;
            }

        }
            System.out.println("Total de pessoas menores de 21 anos: " +menor);
        System.out.println("Total de pessoas maiores de 50 anos: " +maior);
    }
}
