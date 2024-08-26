package jeuMaths;

import java.util.Scanner;

public class Operation {
    int nombre1;
    int nombre2;
    int resultPlayer;
    int correctResult;

    String operateur;

    public Operation (final int nombre1, final int nombre2,
                      final String operateur){
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.resultPlayer = 0;
        this.correctResult = 0;
        this.operateur = operateur;
    }

    public int printOperationAndGetPlayerResult(){
        Scanner inputResultat = new Scanner(System.in);
        if (this.operateur.equals("-") && this.nombre2 > this.nombre1) {
            System.out.print("\n" + this.nombre2 + " " + this.operateur + " " + this.nombre1 + " = ");
        }else {
            System.out.print("\n" + this.nombre1 + " " + this.operateur + " " + this.nombre2 + " = ");
        }
        //TODO : Verifier erreur d'entree utilisateur(ex: aaaaa)
        String resultat_str = inputResultat.nextLine();
        try {
            this.resultPlayer = Integer.parseInt(resultat_str);
        }catch (Exception e) {
            System.out.println("ERREUR: Vous devez entrer un nombre");
            return printOperationAndGetPlayerResult();
        }
        return this.resultPlayer;
    }

    public int calcultate(){
        this.correctResult = switch(this.operateur){
            case "+" -> this.nombre1 + this.nombre2;
            case "-" -> {
                if (this.nombre2 > this.nombre1) {
                    yield this.nombre2 - this.nombre1;
                } else{
                    yield this.nombre1 - this.nombre2;
                }
            }
            case "*" -> this.nombre1 * this.nombre2;
            case "/" -> this.nombre1 / this.nombre2;
            default -> 0;
        };
        return correctResult;
    }

}
