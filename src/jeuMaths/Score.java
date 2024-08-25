package jeuMaths;

public class Score {
    int score;
    int response;
    int numberOfOperations;
    int correctResult;

    public Score (int response, int numberOfOperations, int correctResult){
        this.response = response;
        this.numberOfOperations = numberOfOperations;
        this.score = 0;
        this.correctResult = correctResult;
    }

    public void calculteScore(){
        if (this.response == this.correctResult){
            this.score ++;
            System.out.println("Réponse correcte !");
        }
        System.out.println("Réponse incorrecte !");
    }

    public void printScoreAndEvaluation(){
        System.out.println("\nVotre score : " + this.score + "/" + this.numberOfOperations);
    }
}


