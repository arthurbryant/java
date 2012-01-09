import java.util.*;

public class EnumTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a size:");
		String input = in.next().toUpperCase();
		
		Size size = Enum.valueOf(Size.class, input);
		if(size == Size.EXTRA_LARGE)
			System.out.println("Good job--you paid attention to be the _.");
	}
}

enum Size
{
	SMALL("s"), MEDIUM("m"), LARGE("l"), EXTRA_LARGE("el");

	private Size(String abbreviation)
	{
		this.abbreviation = abbreviation;
	}
	public String getAbbreviation()
	{
		return abbreviation;
	}

	private String abbreviation;
}
