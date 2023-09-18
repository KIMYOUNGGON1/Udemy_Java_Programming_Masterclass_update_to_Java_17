package section_5;

public class IfKeywordAndCodeBlocks_Challenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            /*
                watch out!
             */
            finalScore += 1000;
            System.out.println("Your final Score was " + finalScore);
        }

        /*
            Below this is my code.
         */
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        int anotherFinalScore = score;

        if (gameOver) {
            anotherFinalScore += (levelCompleted * bonus);
            System.out.println("This is challenge! Your final Score was " + anotherFinalScore);
        }

        /*
            Below this is lecture code.
         */
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        int newFinalScore = newScore;

        if (newGameOver) {
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println("Your final Score was " + newFinalScore);
        }

        /*
            Second way to solve problem
         */
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final Score was " + finalScore);
        }

    }
}
