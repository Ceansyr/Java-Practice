public class MethodChallenge {
    public static void main(String[] args) {
//        calculateHighScore(1500);
        displayHighScore("Chinmay", calculateHighScore(1500));
        displayHighScore("Swamini", calculateHighScore(1000));
        displayHighScore("Bob", calculateHighScore(500));
        displayHighScore("Cloe", calculateHighScore(100));
        displayHighScore("Jan", calculateHighScore(25));
    }
    private static int  calculateHighScore(int score){
        int rank;
        if (score >= 1000) {
            rank = 1;
        } else if (score >= 500) {
            rank = 2;
        } else if (score >= 100) {
            rank = 3;
        } else {
            rank = 4;
        }
        return rank;
    }
    public static void displayHighScore(String playerName, int Rank) {
        System.out.println(playerName + " managed to get into position " + Rank + " on the highest score list.");
    }
}
