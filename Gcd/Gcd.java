import java.util.*;
public class Gcd
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
//		int n = s.nextInt();
		for(int i=2; i<=m; i++)
		{
			sum =0;
			System.out.println(sumNum(i));
		}
//		displayMessage("hello", m);
//	
		}
	private static double sum = 0;
/*	public static int gcd(int m, int n)
	{
		int gcd = 0;

		if(m % n == 0)
			gcd = n;
		else
			gcd = gcd(n, m%n);

		return gcd;
		}
	public static void displayMessage(String message, int times)
	{
		if(times == 1)
			System.out.println(message);
		else
		{
			displayMessage(message, times-1);
			System.out.println(message);
		}
	}*/
	public static double sumNum(double n)
	{
		if(n == 1)
			sum += 0.5;
		else
		{
			n--;
			sum = sumNum(n) + (n+1)/(n+2);
		}
		return sum;
		
	}
}

