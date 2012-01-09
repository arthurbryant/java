import java.util.*;

class Sqrt
{
	public static void main(String[] args)
	{
			System.out.println("Enter a number:");
			Scanner n = new Scanner(System.in);
			double num = n.nextDouble();
			System.out.println(sqrt(num));
	}

	public static double sqrt(double num)
	{
		double lastGuess = 0;
		double nextGuess = num /2;

		do
		{	
			lastGuess = nextGuess;
			nextGuess = (lastGuess + (num / lastGuess)) / 2;
			System.out.println(nextGuess);
		}
		while(Math.abs(lastGuess - nextGuess) > 0.01);


		return nextGuess;
	}
}	

	

