package jeuMaths;

import java.util.Scanner;

public class Menu {

    public String operationUserChoice(){
        int choixOperationInt = 0;

        System.out.println("\nQuelle operation souhaitez vous effectuer ?");
        System.out.println("1: Addition");
        System.out.println("2: Soustraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Toutes");

        Scanner operation = new Scanner(System.in);
        System.out.print("Votre choix (entre 1 et 5): ");
        String choixOperationStr = operation.nextLine();

        try {
            choixOperationInt = Integer.parseInt(choixOperationStr);

            if (choixOperationInt < 1 || choixOperationInt > 5) {
                System.out.println("ERREUR : Vous devez entrer un nombre entre 1 et 5");
                return operationUserChoice();
            }
        } catch (NumberFormatException e) {
            System.out.println("ERREUR : Vous devez entrer un nombre entre 1 et 5");
            return operationUserChoice();
        }
        String[] operateurs = {"+", "-", "x", "/"};
        String operateur;
        switch(choixOperationInt){
            case 1 -> operateur = operateurs[0];
            case 2 -> operateur = operateurs[1];
            case 3 -> operateur = operateurs[2];
            case 4 -> operateur = operateurs[3];
            case 5 -> operateur = operateurs[(int)Math.floor(Math.random() * (2 - 1 + 1) + 1)];
            default -> operateur = "";
        };
        return operateur;
    }

    public int difficultyUserChoice() {
        int difficultyChoiceInt = 0;

        System.out.println("\nDifficulté :");
        System.out.println("1: Facile :");
        System.out.println("2: Moyenne :");
        System.out.println("3: Difficile :");

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
