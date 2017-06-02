import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EightBall {
	
	static String[] answer = {
	"It is certain",
	"It is decidedly so",
	"Without a doubt",
	"Yes definitely",
	"You may rely on it",
	"As I see it, yes",
	"Most likely",
	"Outlook good",
	"Yes",
	"Signs point to yes",
	"Reply hazy try again",
	"Ask again later",
	"Better not tell you now",
	"Cannot predict now",
	"Concentrate and ask again",
	"Don't count on it",
	"My reply is no",
	"My sources say no",
	"Outlook not so good",
	"Very doubtful"
			 };
	
	static Random randomGenerator = new Random();
	static String again = "y";
	
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		
		while(again.equalsIgnoreCase("y")){
			System.out.println("Enter your question");
			int i = randomGenerator.nextInt(answer.length);
			scn.nextLine();
			
			System.out.println(answer[i]);
			
			System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
			again = scn.nextLine();
		}
	}

}
