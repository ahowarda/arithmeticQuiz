import java.util.Scanner;

public class arithmeticQuiz {

	/*
	 *	Andrew Howard
	 *	October 4, 2016
	 *	The program will give an elementary level arithmetic quiz of 10 questions between addition,
	 *	subtraction, multiplication, and division. 
	 */
	
	public static int addition() {
		int num1 = (int)(Math.random() * 10) + 1;
		int num2 = (int)(Math.random() * 10) + 1;
		System.out.printf("%5d",num1);
		return num1 + num2;
		
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int grade = 0;
		int points = 0;
		int counter = 0;
		
		
		for (int i = 0; i < 10; i++) {
			
			int questionNum = (int)(Math.random()*4 + 1);
			
			if (questionNum == 1) {
				addition();
				
			}

				
		}
		
		keyboard.close();
	}
}