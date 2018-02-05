import java.util.Random;

public class RandomPlayer extends Player {

	@Override
	public Roshambo generateRoshambo() {
		int pick;
		pick = randInt(1, 3);
		if (pick == 1) {
			return Roshambo.Rock;
		} else if (pick == 2) {
			return Roshambo.Paper;
		} else {
			return Roshambo.Scissors;
		}
	}

	public static int randInt(int min, int max) {

		Random rand = new Random();

		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

}
