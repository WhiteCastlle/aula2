package com.company;

import java.util.Scanner;

public class cargos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lista de Cargos!");
        System.out.println("-------------------");
        System.out.println("1 - Escrituário");
        System.out.println("2 - Secretário");
        System.out.println("3 - Caixa");
        System.out.println("4 - Gerente");
        System.out.println("5 - Diretor");
        System.out.println("-------------------");
        System.out.println("Informe Seu cargo: ");
        int cargo = sc.nextInt();
        System.out.println("Informe Seu salário");
        double salario = sc.nextDouble();
        switch (cargo)
        {
            case 1:
            System.out.println("Seu novo salário é: "+ (salario+salario/100*50));
            break;

            case 2:
                System.out.println("Seu novo salário é: "+ (salario+salario/100*35));
                break;

            case 3:
                System.out.println("Seu novo salário é: "+ (salario+salario/100*20));
                break;
            case 4:
                System.out.println("Seu novo salário é: "+ (salario+salario/100*10));
                break;
            case 5:
                System.out.println("Seu salário  não sofreu alteração");
                break;
            default:
                System.out.println("opção inválida!");
        }
    }
}
