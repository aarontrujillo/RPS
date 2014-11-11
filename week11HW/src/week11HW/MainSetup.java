package week11HW;
import java.util.*;
public class MainSetup {


	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int pick;
		int results;
		
		System.out.println("Rock, Paper, Scissors!\n" + 
                "Enter a move.\n" + "Rock = 1, Paper" + 
                "= 2, and Scissors = 3.");
		pick = input.nextInt();
		Random end = new Random(pick);
		System.out.println("Do you feel lucky, press 1. If not press 2.");
		results = input.nextInt();
		
		if (results == 1)
		{
			end.EnterValue(pick);
		}
		else if (results == 2)
		{
			end.PolymorphismEndGame();
		}
		end.OutCome();
	}
}

// Good...if you have time, please try ToSring()
