public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println("New score is : " + calcuateScore("Tim", 500));
        System.out.println("New score is : " + calcuateScore(10));

        calcuateScore(75);
        calcuateScore();
    }

    public static int calcuateScore(String playerName, int score) {
        System.out.println("Player : " + playerName + " Scored " + score + " points");
        return score * 1000;
    }

    // Method Overloading
    public static int calcuateScore(int score) {
        return calcuateScore("Anonymous", score);
    }

    // Method Overloading
    public static int calcuateScore() {
        System.out.println("No player name, no player scored");
        return 0;
    }
}
