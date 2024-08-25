package jeuMaths;

public class Main {
    public static void main (String[] args) {

        final int operationsNumber = 3; // Numbers of operations


        // Create score && menu instances


        Menu menu = new Menu();
//        Score score = new Score(resultIsCorrect, operationsNumber);

        // Print Choice Operation Menu && Choice Difficulty Menu
        String operationType = menu.operationUserChoice();
        int difficulty = menu.difficultyUserChoice();

        // Loop according operationsNumber

        for (int i = 0; i < operationsNumber; i++) {
            // Generate two numbers
            int n1 = generationRandomNumber(difficulty);
            int n2 = generationRandomNumber(difficulty);
            // Check if numbers allow division if not -> generate two other numbers
            if (operationType.equals("/")) {
                while ((n1 % n2 != 0 || n1 == n2)) {
                    n1 = generationRandomNumber(difficulty);
                    n2 = generationRandomNumber(difficulty);
                }
            }

            Operation operation = new Operation(n1, n2, operationType);

            int playerResult = operation.printOperation();

            int correctResult = operation.calcultate();
            Score score = new Score(playerResult, operationsNumber, correctResult);
            score.calculteScore();

        }
        score.printScoreAndEvaluation();

    }

    // Function generating random number between min and max
    public static int generationRandomNumber(int difficulte) {
        int min = 2;  // Do no change min value !
        int max = 0;

        switch (difficulte) {
            case 1 -> max = 20;
            case 2 -> max = 50;
            case 3 -> max = 100;
        }

        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}
