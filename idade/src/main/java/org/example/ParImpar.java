package org.example;
import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par");
        } else {
            System.out.println(numero + " é um número ímpar");
        }

        scan.close();






    }
}
