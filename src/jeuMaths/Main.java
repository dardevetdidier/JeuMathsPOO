package jeuMaths;

public class Main {
    public static void main (String[] args) {

        final int operationsNumber = 3; // Numbers of operations
        int score = 0;

        // Create menu instances

        Menu menu = new Menu();

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

            // Create new operation
            Operation operation = new Operation(n1, n2, operationType);

            // print operation and get the player result
            int playerResult = operation.printOperationAndGetPlayerResult();

            // Calculate correct result
            int correctResult = operation.calcultate();

            // Compare player result and correct result to calcultate score
            if(playerResult == correctResult){
                System.out.println("Réponse correcte");
                score ++;
            }else {
                System.out.println("Réponse incorrecte");
            }
        }
        // Print total score
        System.out.println("\n----- Votre score : " + score + "/" + operationsNumber + " -----");
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
