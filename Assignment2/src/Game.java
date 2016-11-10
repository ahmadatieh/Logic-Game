
/******************************************************************
 * Program or Assignment #: Assignment 2 The Worried Wizard
 *
 * Programmer: Ahmad Atieh
 *
 * Due Date: 10/2/15
 *
 * COMP110-002/3, Fall 2015       Instructor: 
 *
 * Pledge: I have neither given nor received unauthorized aid
 *         on this program. 
 *
 * Description: A program that utilizes if else statements and scanner inputs to 
 * create an interactive game that allows multiple outcomes based off of user input
 *
 * 
 *
 * Input: Scanner keyboard = new Scanner(System.in);
In other words, the input is the keyboard using a scanner input
 *
 * Output: Based off of user input, but will include stories: A, B, C, D, E, F, G, H, I, J, and K
 * depending on the specific inputs
 * Attempt number:
 * Chart:
 * Input 1: A--> B (1) --> C--> K
 * Input 1: A--> B (2) --> D--> K
 * Input 2: A--> E (1) --> F--->K
 * Input 2: A--> E (2) --> G--->K
 * Input 3: A--> H (1) --> I--->I --> I infinite amount of times
 * Input 3: A--> H (2) --> J--->K
 * (After three attempts, game will print) Game Over
 * 
 *
 ******************************************************************/
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {

		Story.intro();
		int counter;
		counter = 0;
		while (counter < 3) {
			System.out.println("Attempt number: " + (counter + 1));
			System.out.println("");
			Story.a();
			int input1;
			Scanner keyboard = new Scanner(System.in);
			input1 = keyboard.nextInt();
			if (input1 == 1) {

				Story.b();

				int input2;
				input2 = keyboard.nextInt();
				if (input2 == 1) {
					Story.c();
				} else {
					Story.d();
				}
			} else if (input1 == 2) {
				Story.e();
				int input3;
				input3 = keyboard.nextInt();
				if (input3 == 1) {
					Story.f();
				} else {
					Story.g();
				}
			} else {
				Story.h();
				int input4;
				input4 = keyboard.nextInt();
				if (input4 == 1) {
					while (input4 == input4) {
						Story.i();
						input4 = keyboard.nextInt();
					}
				} else {

					Story.j();
				}
			}
			Story.k();
			int input5;
			input5 = keyboard.nextInt();
			counter = counter + 1;
			if (counter == 3) {
				System.out.println("Game Over");
			}
		}

	}
}