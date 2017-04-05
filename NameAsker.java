import java.util.Scanner;

public class NameAsker
{
	public static void greet ()
	{
	Scanner scan = new Scanner(System.in); 
	System.out.print("Please enter your name: ");
    String name = scan.nextLine();
	System.out.print("Now please enter your last name: ");
    String lastname = scan.nextLine();
    System.out.println("Hello, " + name + " " + lastname + "!");
	scan.close();
	}
}