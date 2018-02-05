/*
 * Nick Soule
 * Lab 12 - rock paper scissors app
 */

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName;
		String comp;
		String person;
		String cont = "y";

		// program stars and gets user's name
		System.out.println("Welcome to Rock Paper Scissor!");
		System.out.println("Enter your name: ");
		userName = scan.nextLine();

		HumanPlayer user = new HumanPlayer();
		user.setName(userName);
		RockPlayer rock = new RockPlayer();
		rock.setName("Rocky 1");
		RandomPlayer rando = new RandomPlayer();
		rando.setName("Some Random Person");
		
		// program asks who the user would like to play and validates the entry
		System.out.println("Welcome " + user.getName() + ". Would you like to play against " + rock.getName() + " or "
				+ rando.getName() + "? (1/2)");
		int vsPlayer = Validator.getInt(scan, "", 1, 2);
		
		// while loop that continues as long as the user wants to
		while (cont.equalsIgnoreCase("y")) {
			// if statements that run through the rest of the program depending on the opponent selected
			if (vsPlayer == 1) {
				comp = rock.generateRoshambo().toString();
				System.out.println("(R)ock, (P)aper, or (S)cissors?");
				user.setUserInput(Validator.getMove(scan, "", "R", "P", "S"));
				person = user.generateRoshambo().toString();
				System.out.println(user.getName() + ": " + person);
				System.out.println(rock.getName() + ": " + comp);
				results(person, comp);

			} else {
				comp = rando.generateRoshambo().toString();
				System.out.println("(R)ock, (P)aper, or (S)cissors?");
				user.setUserInput(Validator.getMove(scan, "", "R", "P", "S"));
				person = user.generateRoshambo().toString();
				System.out.println(user.getName() + ": " + person);
				System.out.println(rando.getName() + ": " + comp);
				results(person, comp);
			}
			cont = Validator.getContinue(scan, "Would you like to continue? y/n", "y", "n");
		}
		// ends program if the user answers 'n'
		System.out.println("Goodbye!");

	}

	// method that compares the two moves/throws and prints back the result
	public static void results(String person, String comp) {
		if (person == comp) {
			System.out.println("Draw!");
		} else if ((person == "Rock" && comp == "Scissors") || (person == "Scissors" && comp == "Rock")) {
			System.out.println("Rock beats Scissors!");
		} else if ((person == "Rock" && comp == "Paper") || (person == "Paper" && comp == "Rock")) {
			System.out.println("Paper beats Rock!");
		} else if ((person == "Paper" && comp == "Scissors") || (person == "Scissors" && comp == "Paper")) {
			System.out.println("Scissors beats Paper!");
		}

	}

}
