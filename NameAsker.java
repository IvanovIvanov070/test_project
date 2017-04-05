import java.util.Scanner;

public class NameAsker
{
	public static void greet (String name, String lastname)
	{
	Scanner scan = new Scanner(System.in); 
	System.out.print("Please enter your name: ");
    name = scan.nextLine();
	System.out.print("Now enter your last name: ");
    lastname = scan.nextLine();
    System.out.println("Hello, " + name + " " + lastname + "!");
	scan.close();
	}
}