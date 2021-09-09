package lab1;
import java.util.Scanner;
public class MovieDriver 
{

	public static void main(String[] args) 
	{
		String choice="y";
		do
		{
			
			Scanner input = new Scanner(System.in);
			Movie title=new Movie();
			
			System.out.println("Enter the name of a movie");	
			String name = input.nextLine();
			title.setTitle(name);
					
			System.out.println("Enter the rating of a movie");	
			String rating = input.nextLine();
			title.setTitle(rating);
			
			System.out.println("Enter the number of tickets sold");	
			int tickets = input.nextInt();
			title.setSoldTickets(tickets);
			input.nextLine();
			
			System.out.println(name+" ("+rating.toUpperCase()+"):   Tickets Sold:   "+tickets);
			
			System.out.println("Would you like to enter another (y or n)");	
			choice = input.nextLine();
		
		//i put .toLowerCase in the while just to make sure if the user inputs Y then it will be okay.
		}while(choice.toLowerCase().equals("y"));
		
		System.out.println("Goodbye!");			
	}

}
