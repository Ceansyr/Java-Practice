public class Challenge {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int lvlCompleted = 8;
        int bonus = 200;
        int finalScore = (lvlCompleted * bonus) + score;

        if (gameOver) {
            System.out.println("Your Score is : " + finalScore);
        }
    }
}
