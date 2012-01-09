import java.util.*;

public class MyTriangle
{
	public static void main(String[] args)
	{
		System.out.println("Enter the 3 sides:");
		Scanner n = new Scanner(System.in);

		int side1, side2, side3;
		side1 = n.nextInt();
		side2 = n.nextInt();
		side3 = n.nextInt();
		if(isValid(side1, side2, side3))
			System.out.println("The area is: " +  area(side1, side2, side3));
		else
			System.out.println("Wrong enter sides!");

	}

	public static boolean isValid(double side1, double side2, double side3)
	{
		return (side1 + side2) > side3 &&
				(side2 + side3) > side1 &&
				(side1 + side3) > side2;
	}

	public static double area(double side1, double side2, double side3)
	{
		double s = (side1 + side2 + side3) / 2;

		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s- side3));
		return area;
		}
}

