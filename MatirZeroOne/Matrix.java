import java.util.*;

public class Matrix
{
	public static void main(String[] args)
	{
		System.out.println("Enter the n:");
		Scanner in = new Scanner(System.in);		
		int n = in.nextInt();
		printMatrix(n);
	}

	public static void printMatrix(int n)
	{
		Random num = new Random();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				int zeroOne = num.nextInt(2);
				System.out.printf("%d ", zeroOne);
			}
			System.out.println();
		}
	}
}

