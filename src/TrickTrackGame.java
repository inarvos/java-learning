import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TrickTrackGame {

	public static void main(String[] args) throws InterruptedException {
		if (args.length != 3) {
			System.out.println("Usage program -cp bin/ player1 player2 10");
			throw new UnsupportedOperationException("Should be only 3 arguments");
		}
		String player1 = args[0];
		String player2 = args[1];
		int tries = Integer.parseInt(args[2]);
		
		
		
		
		
		
		Random roundRandomizer = new Random();
		
		//TODO: зібрати статистику по 100 турнірам(по 10 раундів)
		
		Map<String, Integer> goals = new HashMap<>();
		
		goals.put(player1, 0);
		goals.put(player2, 0);
		
		for (int i = 0; i < tries; i++) {
			System.out.println("Try № " + (i + 1));
			Thread.sleep(roundRandomizer.nextInt(500));
			int[] p1 = {RollDice.nextTry(), RollDice.nextTry()};
			Thread.sleep(roundRandomizer.nextInt(500));
			int[] p2 = {RollDice.nextTry(), RollDice.nextTry()};
			
			goals.put(player1, goals.get(player1) + p1[0] + p1[1]);
			goals.put(player2, goals.get(player2) + p2[0] + p2[1]);
			
			//TODO: Вивести інформацію про результат раунда, хто переміг
			
		}
		//TODO: Вивести загальну інформацію про переможця за підсумком 10 раундів
		System.out.println(goals);
	}
}
class RollDice {
	private static final int MAX_DICE = 6;
	
	private static final Random RANDOMIZER = new Random();
	
	public static int nextTry() {
		return RANDOMIZER.nextInt(MAX_DICE) + 1;
	}
	
}
