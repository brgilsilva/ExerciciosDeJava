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
