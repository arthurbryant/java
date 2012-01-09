public class EqualsTest
{
	public static void main(String args[])
	{
		Employee alice1 = new Employee("Alice", 100);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alice", 100);	

		System.out.println("alice1 == alice2" + (alice1 == alice2));
		System.out.println(alice1.equals(alice3));
	}
}
