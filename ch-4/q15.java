// Game of craps
import java.lang.*;
import java.util.*;

/** 
*	1. Player bets some amount of money
*	2. The player throws the dice
*	3. If the dice total 2 or 12 the player loses the bet and play starts again at step 1
*	4. If the dice total 7 or 11 the player wins the amount of the bet from the house and play starts again at step 1
*	5. If the dice total any other value, this value is called the point.
*	6. The player continues to roll the dice until they total either 7 or the point.
*	7. If the dice total is 7 the player wins the bet; otherwise, the player has made the point and wins the amount of the bet 
*	   from the house. In either case, play starts again at step 1.
*/

public class q15{
	public static void main(String args[]){
		System.out.println("**** Game of craps. ****");
		System.out.print("Enter your name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Welcome " + name + "!");
		int xMoney = (int)(Math.random() * 1000);
		System.out.println("Lets get started. You currently have $" + xMoney + " with you to play with.");
		System.out.println("If anytime during the game you need to read the rules, type \"rules\" when asked for any input!");
		System.out.print("How much money would you like to bet? ");
		int betMoney = scan.nextInt();	// bet money from the user
		while(betMoney != -1){
			int diceTotal = dice();
			if(diceTotal == 2 || diceTotal == 12){
				System.out.println("You lose the bet! Game will restart now!!");
				xMoney -= betMoney;
			}
			if(diceTotal == 7 || diceTotal == 11){
				System.out.println("You win the bet! Game will restart now!!");
				xMoney += betMoney;
			}
			else{
				int point = dice();
				System.out.println("Dice will roll again to total either 7 or " + point + ".");
				int newDiceTotal = dice();
				while(newDiceTotal != 7 && newDiceTotal != point){
					newDiceTotal = dice();
				}
				if(newDiceTotal == 7){
					System.out.println("You lost the bet. Game will start again!");
					xMoney -= betMoney;
				}
				if(newDiceTotal == point){
					System.out.println("You win the bet. Game will start again!");
					xMoney += betMoney;
				}
			}
			System.out.println("You now have $" + xMoney + " in your account.");
			if(xMoney <= 0){
                System.out.println("Sorry you do not have enough money to play another bet!\nThanks for playing game of craps");
				break;
			}
			System.out.print("How much money would you like to bet? ");
			betMoney = scan.nextInt();
		}
	}

	// make an input function which will be used everytime an input needs to be taken.

	// static String input(Scanner scan){
	// 	userInput = 
	// }

	static int dice(){
		int dice1, dice2;
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		return (dice1 + dice2);
	}

	static void rules(){
		/** Rules for the game can be read by invoking this method. */
		System.out.println("if your dice total is 2 or 12 you will lose the bet and the game will start again.");
		System.out.println("if your dice total is 7 or 11 you will win the money from the house and game will start again.");
		System.out.println("if the total is some other value then the total is called point.");
		System.out.println("to win the next dice total has to be 7 or the point to win the game.");
	}
}