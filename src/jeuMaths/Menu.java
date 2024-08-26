package jeuMaths;

import java.util.Scanner;

public class Menu {

    public int operationUserChoice(){
        int operationChoiceInt = 0;

        String menuOperrationChoice = """
                
                Choisissez une opération
                    1: Addition
                    2: Soustraction
                    3: Multiplication
                    4: Division
                    5: Aléatoire
                """;
        System.out.println(menuOperrationChoice);


        Scanner operation = new Scanner(System.in);
        System.out.print("Votre choix (entre 1 et 5): ");
        String operationChoiceStr = operation.nextLine();

        try {
            operationChoiceInt = Integer.parseInt(operationChoiceStr);

            if (operationChoiceInt < 1 || operationChoiceInt > 5) {
                System.out.println("ERREUR : Vous devez entrer un nombre entre 1 et 5");
                return operationUserChoice();
            }
        } catch (NumberFormatException e) {
            System.out.println("ERREUR : Vous devez entrer un nombre entre 1 et 5");
            return operationUserChoice();
        }
        return operationChoiceInt;
    }

    public int difficultyUserChoice() {
        int difficultyChoiceInt = 0;
        String menuDifficultyChoice = """
             
             Choisir une difficulté
                1: Facile
                2: Moyenne
                3: Difficile
             """;
        System.out.println(menuDifficultyChoice);

        Scanner difficulty = new Scanner(System.in);
        System.out.print("Votre choix (entre 1 et 3) : ");
        String choixDifficulteStr = difficulty.nextLine();

        try {
            difficultyChoiceInt = Integer.parseInt(choixDifficulteStr);
            if (difficultyChoiceInt < 1 || difficultyChoiceInt > 3) {
                System.out.println("ERREUR: Vous devez entrer un nombre entre 1 et 3");
                return difficultyUserChoice();
            }
        } catch (NumberFormatException e) {
            System.out.println("ERREUR: Vous devez entrer un nombre entre 1 et 3");
            return difficultyUserChoice();
        }

        return difficultyChoiceInt;
    }
}
