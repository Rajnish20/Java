import java.util.Scanner;
import java.util.*;
public class OddandEve {

	public static void main(String[] args) {
	System.out.println("Let`s play a game called **Odds or Evens**");
    Scanner input=new Scanner(System.in);
	System.out.print("What is your name?");
	String name=input.next();
	System.out.print("Hi!" +name +",which do you choose?Odds or Evens?");
	String choose=input.next();
	if(choose.equals("Evens"))
	{System.out.println("You picked Evens!The computer will chose Odds.");
	}
	else
	{System.out.println("You picked Odds!The computer will chose Evens.");
	}
	System.out.println("*************");
	System.out.print("How many fingers do you put out? You have to choose from 0-5");
	int fingers=input.nextInt();
	Random rand=new Random();
	int computer=rand.nextInt(6);
	System.out.println("The computer plays number " +computer);
	System.out.println("*************");
	int sum=fingers+computer;
	if(sum%2==0)
	{ System.out.println("The sum is Even.");
	 if(choose.equals("Evens"))
	 {System.out.println("You Win! Congratulations");}
	 else
	 {System.out.println("Computer Wins!");
	 }
	}
	 else {
	System.out.println("The sum is odd.");
	if(choose.equals("Odds"))
			{
		System.out.println("You Wins! Congratulations");
			}
	else
	{System.out.println("Computer wins!");
	}
}
    
	}
}
	


