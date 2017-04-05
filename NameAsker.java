import java.util.Scanner;

public class NameAsker
{
	public static void greet (String name)
	{
	Scanner scan = new Scanner(System.in); 
	System.out.print("Please enter your name: ");
    name = scan.nextLine();
    System.out.println("Hello " + name + "!");
	scan.close();
	}
}