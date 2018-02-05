
public class HumanPlayer extends Player {
	String userInput;

	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	@Override
	public Roshambo generateRoshambo() {
		if (userInput.equalsIgnoreCase("R")) {
			return Roshambo.Rock;
		} else if (userInput.equalsIgnoreCase("P")) {
			return Roshambo.Paper;

		} else {
			return Roshambo.Scissors;
		}

	}
}
