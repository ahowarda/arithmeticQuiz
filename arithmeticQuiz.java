import java.util.Scanner;

public class arithmeticQuiz {

	/*
	 * Andrew Howard October 4, 2016 The program will give an elementary level
	 * arithmetic quiz of 10 questions between addition, subtraction,
	 * multiplication, and division.
	 */

	// When the questionNum == 1 in the main Method it runs addition.
	public static int addition(int points) {
		Scanner keyboard = new Scanner(System.in);

		// Creates 2 random integers between 1 and 20 for addition.
		int num1 = (int) (Math.random() * 20) + 1;
		int num2 = (int) (Math.random() * 20) + 1;
		if (num2 >= num1) {
			System.out.printf("%5d %n +%3d%n------%n    ?%n", num2, num1);
		} else if (num1 > num2) {
			System.out.printf("%5d %n +%3d%n------%n    ?%n", num1, num2);
		}
		System.out.print("Input your answer:  ");
		int answer = keyboard.nextInt();

		// Creates the sum of the integers to check against the users answer
		int sum = num1 + num2;

		// Checks if the answer is correct or incorrect and adds points
		// accordingly.
		if (sum == answer) {
			points += 10;
			correct();
		} else if (sum != answer) {
			incorrect();
			System.out.print("Input your answer: ");
			answer = keyboard.nextInt();
			if (sum == answer) {
				points += 5;
				correct();
			} else {
				System.out.println("Both of your answers were incorrect, the correct answer is " + sum + '.');
			}
		}
		return points;
	}

	// When the questionNum == 2 in the main Method it runs subtraction.
	public static int subtraction(int points) {
		Scanner keyboard = new Scanner(System.in);

		// Creates 2 random integers between 1 and 20
		int num1 = (int) (Math.random() * 40) + 1;
		int num2 = (int) (Math.random() * 40) + 1;
		/*
		 * Creates the sum, and then uses the if statement to setup the smaller
		 * number being subtracted from the smaller
		 */
		int sub = 0;
		if (num2 >= num1) {
			sub = num2 - num1;
			System.out.printf("%5d %n -%3d%n------%n    ?%n", num2, num1);
		} else if (num1 > num2) {
			sub = num1 - num2;
			System.out.printf("%5d %n -%3d%n------%n    ?%n", num1, num2);
		}
		System.out.print("Input your answer:  ");
		int answer = keyboard.nextInt();

		if (sub == answer) {
			points += 10;
			correct();
		} else if (sub != answer) {
			incorrect();
			System.out.print("Input your answer: ");
			answer = keyboard.nextInt();
			if (sub == answer) {
				points += 5;
				correct();
			} else {
				System.out.println("Both of your answers were incorrect, the correct answer is " + sub + '.');
			}
		}
		return points;
	}

	// When the questionNum == 3 in the main Method it runs multiplication.
	public static int multiplication(int points) {
		Scanner keyboard = new Scanner(System.in);

		// Creates 2 random integers between 1 and 20 for num1 and 1 and 9 for
		// num2 for multiplication.

		int num1 = (int) (Math.random() * 20) + 1;
		int num2 = (int) (Math.random() * 9) + 1;

		// Creates a way to print out the larger number on top of the smaller
		if (num2 >= num1) {
			System.out.printf("%5d %n x%3d%n------%n    ?%n", num2, num1);
		} else if (num1 > num2) {
			System.out.printf("%5d %n x%3d%n------%n    ?%n", num1, num2);
		}
		System.out.print("Input your answer:  ");
		int answer = keyboard.nextInt();

		// Creates the product of the integers to check against the users answer
		int product = num1 * num2;

		// Checks if the answer is correct or incorrect and adds points
		// accordingly.
		if (product == answer) {
			points += 10;
			correct();
		} else if (product != answer) {
			incorrect();
			System.out.print("Input your answer: ");
			answer = keyboard.nextInt();
			if (product == answer) {
				points += 5;
				correct();
			} else {
				System.out.println("Both of your answers were incorrect, the correct answer is " + product + '.');
			}
		}
		return points;

	}

	// When the questionNum == 4 in the main Method it runs division.
	public static int division(int points) {
		Scanner keyboard = new Scanner(System.in);
		// Creates the way out of the while loop.
		boolean check = true;
		// Initializes the integers to calculate to quotient to use after the
		// while loop.
		int num1 = 0;
		int num2 = 0;
		int quo = 0;

		/*
		 * The while loop makes sure that when division is selected in the Main
		 * method, that it will give a division question. By making sure that
		 * the either modulo is equal to zero. If it is, then it will print out
		 * the bigger number over the smaller. If not it will start over with 2
		 * more random integers.
		 */

		while (check) {

			// Creates 2 random integers between 1 and 40
			num1 = (int) (Math.random() * 40) + 1;
			num2 = (int) (Math.random() * 40) + 1;
			if (num1 % num2 == 0) {
				quo = num1 / num2;
				System.out.printf("%3d %n---- = ?%n%3d%n", num1, num2);
				check = false;
			} else if (num2 % num1 == 0) {
				quo = num2 / num1;
				System.out.printf("%3d %n---- = ?%n%3d%n", num2, num1);
				check = false;
			}
		}
		System.out.print("Input your answer:  ");
		int answer = keyboard.nextInt();
		if (quo == answer) {
			points += 10;
			correct();
		} else if (quo != answer) {
			incorrect();
			System.out.print("Input your answer: ");
			answer = keyboard.nextInt();
			if (quo == answer) {
				points += 5;
				correct();
			} else {
				System.out.println("Both of your answers were incorrect, the correct answer is " + quo + '.');
			}
		}
		return points;
	}

	// Prints the incorrect statement if the user is incorrect for the first time.
	public static void incorrect() {
		System.out.println("Your answer is incorrect, try again.");
	}

	// Prints the correct statement once the user is correct.
	public static void correct() {
		System.out.println("Correct!");
		System.out.println();
	}

	public static void main(String[] args) {
		
		// Gives the name of the test to the user
		System.out.println("The Arithmetic Test \n-------------------\n");

		// Starts the points out at 0.
		int points = 0;

		// Runs the 10 question quiz.
		for (int i = 0; i < 10; i++) {

			// Randomizer for test questions.
			int questionNum = (int) (Math.random() * 4 + 1);

			/*
			 * Whatever number the randomizer is, it will run that arithmetic
			 * question, and will use whatever points it gets from that question
			 * and add it back to points.
			 */

			if (questionNum == 1) {
				points = addition(points);
			} else if (questionNum == 2) {
				points = subtraction(points);
			} else if (questionNum == 3) {
				points = multiplication(points);
			} else if (questionNum == 4) {
				points = division(points);
			}
		}
		// The final print statement of their final grade.
		System.out.println("Your final score is " + points + " out of 100.");
	}
}
