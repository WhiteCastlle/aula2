package com.company;

import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        double A,B,C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
            A = sc.nextDouble();
        System.out.println("Informe o segundo número");
            B = sc.nextDouble();
        System.out.println("Informe o terceiro número");
            C = sc.nextDouble();
        if ((A < B) && (B < C) && (A < C))
        {
            System.out.println(A+" - "+B+" - "+C);
        }
        else if ((A < B) && (B > C) && (A < C))
        {
            System.out.println(A + " - " + C + " - " + B);
        }
        else if ((A > B) && (B < C) && (A < C))
        {
            System.out.println(B + " - " + A + " - " + C);
        }
        else if ((A < B) && (B > C) && (A > C))
        {
            System.out.println(C + " - " + A + " - " + B);
        }
        else if ((A > B) && (B < C) && (A > C))
        {
            System.out.println(B + " - " + C + " - " + A);
        }
        else if ((A > B) && (B > C) && (A > C))
        {
            System.out.println(C + " - " + B + " - " + A);
        }

    }

}
