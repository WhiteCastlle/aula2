package com.company;

import java.util.Scanner;

public class natacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double idade;
        System.out.println("Qual a idade do nadador?");
        idade = sc.nextDouble();
        if (idade <= 10)
        {
            System.out.println("INFANTIL");
        }
        else if (idade <= 17)
        {
            System.out.println("JUVENIL");
        }
        else if (idade > 17)
        {
            System.out.println("SENIOR");


        }
    }
}
