/*
 Zachary Hanna
 January 25, 2017
 Description:  This program uses a random number generator to simulate a coin toss.
*/ 

import java.util.Scanner; // library for keyboard usage
import java.util.Random; // library for random numbers

public class CoinToss
{
  public static void main(String[] args) 
  {
    String tossedCoin; // the result of the coin toss
    String quit;
    int userOption, winsOfUser = 0, lossesOfUser = 0; // declared variables for users choice and score
    
    Scanner keyboard = new Scanner(System.in); // allows keyboard inputs from the user
    Random randomNumbers = new Random();  // generates random numbers
    
    do
    {
    System.out.println("Enter '0' for heads or '1' for tails:"); // asks user for heads or tails
    userOption = keyboard.nextInt(); // keyboard input for heads or tails
      
    int coinResult = randomNumbers.nextInt(2); // the 2 random numbers
    
    if (coinResult == 1) // if-else statement to determine who won the match
    {
      tossedCoin = "Heads";
      if (userOption == 0)
        winsOfUser++;
      else
        lossesOfUser++;
    }
    else
    {
      tossedCoin = "Tails";
      if (userOption == 1)
        winsOfUser++;
      else
        lossesOfUser++;
    }

    System.out.println("The coin is showing " + tossedCoin + "!"); // tells the user the result of the coin toss
    
    System.out.println("You have " + winsOfUser + " wins and " + lossesOfUser + " losses."); // tells the user the score at given moment
    
    System.out.println("Type 'q' to quit the program:"); // option for user to quit program when finished
    quit = keyboard.next();

    }while(!quit.toLowerCase().equals("q")); // needed to quit program
    
  }
}