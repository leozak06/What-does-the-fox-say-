/*
FoxSays V00840048 Leoza Kabir
CSC 110
Description: Make the program request user input from command line, and then the program will make the fox appear on the screen and say the text that has been entered.
Input: Type what the user wants the fox to say Output: Program prints out the fox and the user input.
*/


import java.util.*;

public class FoxSays {
	public static void main (String[]args){
		theMessage();
		printFox();

	}
	public static void theMessage(){
		System.out.print("What does the fox say? ");
		String theMessage= "";
		Scanner console= new Scanner(System.in);
		theMessage = console.nextLine();
		theMessage.length();
			for (int m=1; m<=theMessage.length()+4; m++){
				System.out.print("*");
			}
		System.out.println("\n| " + theMessage + " |");
			for (int m=1; m<=theMessage.length()+4; m++){
				System.out.print("*");
			}

	}
	public static void printFox(){
		System.out.println();
		System.out.println("      \\");
		System.out.println("       \\ /\\   /\\");
		System.out.println("  ____  //\\\\_//\\\\");
		System.out.println(" /   /  \\_     _/");
		System.out.println("[^^^]    / * * \\");
		System.out.println("[   ]    \\_\\o/_/");
		System.out.println("\\   ]    _/   \\");
		System.out.println(" \\  \\  _/     /");
		System.out.println("  \\_ \\/  \\ ] ]");
		System.out.println("    \\_\\  / ] ]_");
	}
}  