package com.company;
import java.util.Scanner;
public class LacosDoWhile5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, contador=1, soma=0;

        do {
            System.out.println("Digite um número: ");
            num = leia.nextInt();
            if (num >= 0) {
                soma += num;
            }
            }
        while (num != 0) ;
        System.out.println("A soma dos números positivos é: "+soma);
        }
}
