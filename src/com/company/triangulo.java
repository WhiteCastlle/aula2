package com.company;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        double A,B,C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a medida do lado A? ");
        A = sc.nextDouble();
        System.out.println("Qual a medida do lado B? ");
        B = sc.nextDouble();
        System.out.println("Qual a medida do lado C? ");
        C = sc.nextDouble();
        if ((A+B>C) && (A+C>B) && (B+C>A))
        {
            System.out.println("Esses números formam um triângulo:");
                if ((A==B) && (A==C))
                {
                    System.out.println("O Triângulo Equilátero");
                }
                else if ((A==B) || (B==C) || (A==C))
                {
                    System.out.println("O Triângulo Isósceles");
                }
                else if ((A!=B) && (B!=C) && (A!=C))
                {
                    System.out.println("O Triângulo Escaleno");
                }
        }
        else if ((A+B<=C) || (A+C<=B) || (B+C<=A))
        {
            System.out.println("Estes números não formam um triângulo!");
        }

    }
}
