package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import java.util.Scanner;
// then press Enter. You can now see whitespace characters in your code.
public class Idade {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);


        System.out.println("Informe a sua idade: ");
        int idade = ler.nextInt();

                if (idade >= 18) {
            System.out.print("Você é maior de idade ");
            } else {
            System.out.print("Você é menor de idade ");
            }
            ler.close();
    }

}