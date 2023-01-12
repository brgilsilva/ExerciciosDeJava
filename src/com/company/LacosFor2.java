package com.company;
import java.util.Scanner;
public class LacosFor2 {

    public static void main(String[] args) {
        //Escreva um algoritmo em Java, que leia 10 números inteiros via teclado
        // e mostre na tela quantos números são pares e quantos número são ímpares.

        int num, par=0, impar=0;
        Scanner leia = new Scanner(System.in);

        for (int contador=0; contador <10 ; contador++) {
            System.out.println("Digite o " +(contador+1)+ "º número: ");
            num = leia.nextInt();
            if (num%2==0) {
                par += 1;
            }
            if (num%2!=0){
                impar += 1;
            }
        }
        System.out.println("Total de números pares: "+par);
        System.out.println("Total de números impares: "+impar);
    }




}
