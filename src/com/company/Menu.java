package com.company;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        boolean escolha = true;
        String mainMenu = ("""
                |            MENU           | \r
                |Opções:                    |\r
                |        1: Opção 1         |\r
                |        2: Opção 2         |\r
                |        3: Sair            |\r
                Selecione a opção:""");
        System.out.println(mainMenu);
        Scanner menu = new Scanner(System.in);





        while (escolha) {
            int opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a primeira opção");
                System.out.println(mainMenu);
                break;

            case 2:
                System.out.println("Você escolheu a segunda opção");
                System.out.println(mainMenu);
                break;
            case 3:
                System.out.println("Programa encerrado");
                escolha = false;
                break;
            default:
                System.out.println("Seleção inválida");
                break;
        }
        }


    }
}
