import java.util.Scanner;
import java.util.Random;


public class BookCricketGame {

	public static void main(String[] args) {
		
		String playerOneName = " ";
		String playerTwoName = " ";
		int book=300;
		int score=0;
		int point = -5;
		int round=0;
		int choice=0;
		int bookPage=0;
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one to start game and zero to exit:");
		choice=sc.nextInt();
		
		while(flag!=false)
		{
		if(choice==1)
		{
		System.out.println("Enter player1 name:  ");
		
		playerOneName=sc.next();
		System.out.println("Enter player2 name:  ");
		playerTwoName=sc.next();
		
		System.out.println("player 1:" + playerOneName);
		Random rand = new Random();
		
		while(point!=0)
		{
			
			System.out.println("Enter 1 to open book");
			choice=sc.nextInt();
			if(choice==1)
			{
			bookPage = 1+rand.nextInt(299);
			point =bookPage%7;
			round++;
			score+=point;
			}
			else if(choice==0)
			{
				break;
			}
			else if(point==0)
			{
				System.out.println("oops!");
				System.out.println("Page number:"+bookPage+"     Point:"+point+"     Score:"+score);
				System.out.println("Total score"+score+"Round "+round);
				
				break;
			}
			else
			{
				score+=point;
				
			}
			System.out.println("Page number:"+bookPage+"     Point:"+point+"     Score:"+score);
		
		
		}
		
		System.out.println(playerTwoName+" needs more than"+score+" points to win the round.");
		// player 2 
		int scoreOfPlayerOne=score;
		int roundOfPlayer1=round;
		score =0;
		//round=0;
		point=-5;
		choice=0;
		while(point!=0)
		{
			if(score>scoreOfPlayerOne&&round>0)
			{
				break;
			}
		
		else
			{
			
			System.out.println("Enter 1 to open book");
			choice=sc.nextInt();
				if(choice==1)
				{
					bookPage = 1+rand.nextInt(299);
					point =bookPage%7;
					//round++;
					round--;
				}
				if(choice==0)
				{
					break;
				}
				if(point==0)
				{
					System.out.println("oops!");
					System.out.println("Page number: "+bookPage+"     Point: "+point+"     Score: "+score);
					System.out.println("Total score"+score+"Round l "+round);
					
					break;
				}
				
				else
				{
					score+=point;
					
				}
				System.out.println("Page number: "+bookPage+"     Point: "+point+"     Score: "+score+"     Round left: "+round);
			
			
			
			}
		}
		
		if(score<scoreOfPlayerOne)
		{
			System.out.println(playerOneName+" won the Match!!! 1");
			
		}
		else
		{
			System.out.println(playerTwoName+" won the Match!!! ");
		}
		
		
		
		
		
		}
		else if(choice==0) {
			//exit;
			flag=false;
		}
		else
		{
			System.out.println("Enter only 0 or 1:");
		}
		}
	}

}
