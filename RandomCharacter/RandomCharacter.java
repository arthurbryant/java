public class RandomCharacter
{
	public static void main(String[] args)
	{
		for(int i=1; i<=100; i++)
		{
			System.out.print(getRandomUpper() + "  ");
			if(i%10 == 0)
				System.out.println();
		}
		System.out.println();
		for(int i=1; i<=100; i++)
		{
			System.out.print(getRandomDigit() + "  ");
			if(i%10 == 0)
				System.out.println();
		}

		System.out.println();
	}
	public static char getRandomCharacter(char ch1, char ch2)
	{
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
		}
	public static char getRandomUpper()
	{
		return getRandomCharacter('A', 'Z');
		}
	
	public static char getRandomDigit()
	{
		return getRandomCharacter('0', '9');
		}
	}
