public class IsPrime
{
	public static void main(String[] args)
	{
		int count = 1000;
		int line = 0;

		for(int i = 0, j = 2; i < count; i++, j++)
		{
			if(isPrime(j))
			{			
				System.out.printf("%-10d", j);
				line++;
			}
			if(line == 10)
			{
				System.out.println();
				line = 0;
			}
		}
	}
	
	public static boolean isPrime(int num)
	{
		for(int i = 2; i <= num/2; i++)
			if(num % i == 0)
				return false;
		return true;
	}
}
