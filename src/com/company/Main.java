package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero,dobro;

        System.out.println("Escreva um número para saber seu dobro");
        numero = sc.nextDouble();
        dobro = numero * 2;
            System.out.println("o dobro de "+numero+" é "+dobro);



    }
}
