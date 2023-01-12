package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class LacosWhile4 {
    public static void main(String[] args) {
        //Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores
        // da área de Desenvolvimento e precisam de um sistema para analisar os dados.

        int idade, sexo = 0, categoria = 0, backend = 0, mFront = 0, mob40 = 0, full30 = 0;
        String contador = "s";
        Scanner leia = new Scanner(System.in);


        while (!contador.equals("n")) {
            System.out.println("Digite sua idade");
            idade = leia.nextInt();
            System.out.println("Qual seu sexo? ");
            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            System.out.println("3 - Outros");
            sexo = leia.nextInt();
            System.out.println("Qual a sua Categoria?");
            System.out.println("1 - Backend");
            System.out.println("2 - Frontend");
            System.out.println("3 - Mobile");
            System.out.println("4 - FullStack");
            categoria = leia.nextInt();

            if (categoria == 1) {
                backend += 1;
            }
            if (sexo == 2 && categoria == 2) {
                mFront += 1;
            }
            if (sexo == 1 && categoria == 3 && idade > 40) {
                mob40 += 1;
            }
            if (sexo == 2 && categoria == 4 && idade < 30) {
                full30 += 1;
            }

            System.out.println("Deseja continuar a leitura dos dados de um novo colaboradore ou não (s/n)");
            contador = leia.next();
        }

        System.out.println("O número de pessoas desenvolvedoras Backend é: " +backend);
        System.out.println("O número de mulheres desenvolvedoras Frontend é: " +mFront);
        System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos é: " +mob40);
        System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos é: " +full30);
    }
    }