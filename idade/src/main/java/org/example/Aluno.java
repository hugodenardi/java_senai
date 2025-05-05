package org.example;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        System.out.print("Digite a quantidade de faltas: ");
        int faltas = scanner.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        System.out.println("A média das notas é " + media);

        if (media >= 7 && faltas < 10) {
            System.out.println("Aluno aprovado");
        }
        else if ((media >= 5 && media <= 7) || (faltas >= 10 && faltas <= 20)) {
            System.out.println("Aluno ficou de recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
