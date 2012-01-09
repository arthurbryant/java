import java.util.*;
public class TowerOfHanoi
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		moveDisk(n, 'A', 'B', 'C');
		}
	
	public static void moveDisk(int n, char fromTower, char toTower, char auxTower)
	{
		if(n == 1)
			System.out.println("move disk" + n + "from " + fromTower + "to" + toTower);
		else
		{
			moveDisk(n-1, fromTower, auxTower, toTower);	
			System.out.println("move disk" + n + "from " + fromTower + "to" + toTower);
			moveDisk(n-1, auxTower, toTower, fromTower);
		}
	}
}
