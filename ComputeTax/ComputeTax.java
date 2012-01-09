import java.util.*;

public class ComputeTax
{
	public static void main(String[] args)
	{
/*		Scanner in = new Scanner(System.in);
		System.out.println("Enter the filing status:");
		int status = in.nextInt();

		System.out.println("Enter the taxalbe income");
		double income = in.nextDouble();
		
		System.out.println("Tax is " + computeTax(status, income));
*/
		System.out.printf("%-8s%-8s%-8s", "case0","case1","case2");
		System.out.println();
		for(int i = 0; i < 200; i++)
		{
			for(int status = 0; status < 3; status++)
			{
				double income = 50000.0 + 50.0 * i; 
				System.out.printf("%.2f  ", computeTax(status, income));
			}
			System.out.println();
		}
		
	}

	public static double computingTax(double income, int r1, int r2)
	{
		double tax = 0.0;
		
		if(income < r1)
			tax = income * 0.1;
		else if(income < r2)
			tax = r1 * 0.1 + (income -r1) * 0.15;
		else 
			tax = r1 * 0.1 + (r2 -r1) * 0.15 + (income - r2) * 0.3;
		
		return tax;
	}
	
	public static double computeTax(int status, double income)
	{
		switch(status)
		{
		case 0:
			return computingTax(income, 6000, 27950);
		case 1:
			return computingTax(income, 12000, 46700);
		case 2:
			return computingTax(income, 6000, 23350);
		default:
			return 0.0;
		}
	}
	

}
