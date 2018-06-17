import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TrickTrackGame {

	private static Map<String, Integer> playTheGame(String player1, String player2, int tries, PrintStream streamer)
			throws InterruptedException {
		Random roundRandomizer = new Random();

		Map<String, Integer> goals = new HashMap<>();

		goals.put(player1, 0);
		goals.put(player2, 0);

		for (int i = 0; i < tries; i++) {

			if (streamer != null) {
				streamer.println("Try ¹ " + (i + 1));
			}

			Thread.sleep(roundRandomizer.nextInt(500));
			int[] p1 = { RollDice.nextTry(), RollDice.nextTry() };

			int playerOneScore = p1[0] + p1[1];

			Thread.sleep(roundRandomizer.nextInt(500));
			int[] p2 = { RollDice.nextTry(), RollDice.nextTry() };

			int playerTwoScore = p2[0] + p2[1];

			goals.put(player1, goals.get(player1) + playerOneScore);

			goals.put(player2, goals.get(player2) + playerTwoScore);

			if (playerOneScore > playerTwoScore) {
				if (streamer != null) {
					streamer.println(String.format("Player 1 wins. Result %d over %d", playerOneScore, playerTwoScore));
				}
			} else if (playerOneScore < playerTwoScore) {
				if (streamer != null) {
					streamer.println(String.format("Player 2 wins. Result %d over %d", playerTwoScore, playerOneScore));
				}
			} else {
				if (streamer != null) {
					streamer.println(String.format("the Draw. Result %d = %d", playerOneScore, playerTwoScore));
				}
			}

		}

		int playerOneScore = goals.get(player1);
		int playerTwoScore = goals.get(player2);

		if (playerOneScore > playerTwoScore) {
			if (streamer != null) {
				streamer.println(String.format("After %d rounds Player 1 wins. Result %d over %d", tries,
						playerOneScore, playerTwoScore));
			}
		} else if (playerOneScore < playerTwoScore) {
			if (streamer != null) {
				streamer.println(String.format("After %d rounds Player 2 wins. Result %d over %d", tries,
						playerTwoScore, playerOneScore));
			}
		} else {
			if (streamer != null) {
				streamer.println(String.format("After %d rounds there is a draw. Result %d = %d", tries, playerOneScore,
						playerTwoScore));
			}
		}
		return goals;
	}

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		if (args.length != 3) {
			System.out.println("Usage program -cp bin/ player1 player2 10");
			throw new UnsupportedOperationException("Should be only 3 arguments");
		}
		String player1 = args[0];
		String player2 = args[1];

		int tries = Integer.parseInt(args[2]);

		final int numberOfTournaments = 3;
		
		
		PrintStream fos = new PrintStream("results3.out");
		
		Map<Integer, Map<String, Integer>> tournaments = new HashMap();
		for (int j = 0; j < numberOfTournaments; j++) {
			tournaments.put(j, playTheGame(player1, player2, tries, fos));
		}

		System.out.println(tournaments);
		
		fos.close();
		
	}
}

class RollDice {
	private static final int MAX_DICE = 6;

	private static final Random RANDOMIZER = new Random();

	public static int nextTry() {
		return RANDOMIZER.nextInt(MAX_DICE) + 1;
	}

}
