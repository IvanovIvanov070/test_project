import java.util.Scanner

public class HelloWorld
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print ("Please enter your name: ");
		String username = scan.nextLine();
		System.out.println ("Hello " + username + "!");
		scan.close();
	}
}