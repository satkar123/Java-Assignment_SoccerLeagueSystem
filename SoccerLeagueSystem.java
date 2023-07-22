import java.util.Random;
import java.util.Arrays;

/**
 * Main class representing the soccer league system.
 * This is the entry point of the program.
 */
public class SoccerLeagueSystem {

    public static void main(String[] args) {
        // Initialize six teams with custom names.
        Team[] teams = {
            new Team("Barcelona"),
            new Team("Real Madrid"),
            new Team("Manchester United"),
            new Team("Bayern Munich"),
            new Team("Juventus"),
            new Team("Liverpool")
        };

        // ... (rest of the code remains unchanged)

        // Initialize game play.
        GamePlay gamePlay = new GamePlay();

        // Play games between all teams.
        for (int i = 0; i < teams.length; i++) {
            for (int j = i + 1; j < teams.length; j++) {
                gamePlay.playGame(teams[i], teams[j]);
            }
        }

        // Initialize leaderboard and print it.
        LeaderBoard leaderboard = new LeaderBoard(teams);
        leaderboard.printLeaderBoard();
    }
}
