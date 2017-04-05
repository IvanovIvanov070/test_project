import java.util.Scanner;

public class HelloWorld
{
	public static void main (String[] args)
	{
		NameAsker greetings = new NameAsker();
		String username = new String();
		String lastname = new String();
		greetings.greet (username,lastname);
	}
}