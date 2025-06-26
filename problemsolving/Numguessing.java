package problemsolving;


	import java.util.Scanner;
	import java.util.Random;

	public class Numguessing {
	    public static void main(String[] args) {
//	        Scanner input = new Scanner(System.in);
//	        Random random = new Random();
//
//	        int numberToGuess = random.nextInt(100) + 1; // Random number from 1 to 100
//	        int userGuess;
//	        int attempts = 0;
//
//	        System.out.println(" Welcome to the Number Guessing Game!");
//	        System.out.println("Guess a number between 1 and 100:");
//
//	        // Loop until the correct guess
//	        do {
//	            System.out.print("Enter your guess: ");
//	            userGuess = input.nextInt();
//	            attempts++;
//
//	            if (userGuess < numberToGuess) {
//	                System.out.println("Too low! Try again.");
//	            } else if (userGuess > numberToGuess) {
//	                System.out.println("Too high! Try again.");
//	            } else {
//	                System.out.println(" Congratulations! You guessed the number in " + attempts + " attempts.");
//	            }
//	        } while (userGuess != numberToGuess);
//
//	        input.close();
//	    }
//	}
Scanner input=new Scanner(System.in);
Random random=new Random();
int numbertoguess=random.nextInt(100)+1;
int userguess;
int attempts=0;
System.out.println(" Welcome to the Number Guessing Game!");
System.out.println("Guess a number between 1 and 100:");
do {
	System.out.println("enter ur guess:");
	userguess=input.nextInt();
	attempts++;
	if(userguess<numbertoguess) {
		System.out.println("too low! try again");
	}else if(userguess>numbertoguess){
		System.out.println("too high! try again");
	}else {
		System.out.println("congratulations! ypu guessed the number");
	}}while(userguess!=numbertoguess);
input.close();
	    }}
	



