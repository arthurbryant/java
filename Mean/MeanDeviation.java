//import java.util.*;

public class MeanDeviation
{
	public static void main(String[] args)
	{
		double[] num = new double[10];

	//	for(double d: num)
	//		d = (Math.random() * 1000.0);
		for(int i=0; i<num.length; i++)
			num[i] = Math.random() * 1000;
		for(double d : num)
			System.out.print(d + " ");
		System.out.println();
		System.out.println();

		System.out.println("The mean is: " + Mean(num));
		System.out.println("The deviation is: " + Deviation(num));
		}

	public static double Mean(double[] x)
	{
		double mean = 0;
		for(double i:x)
			mean += i;
		mean /= x.length;
		
		return mean;
	}


	public static double Deviation(double[] x)
	{
		double deviation;

		double temp1 = 0, temp2 = 0;
		for(double i:x)
			temp1 += Math.pow(i, 2);
		temp2 = Math.pow(Mean(x) * x.length, 2) / x.length;
		deviation = Math.sqrt((temp1 - temp2) / (x.length - 1));
		return deviation;
	}
}
