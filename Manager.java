class Manager extends Employee
{
	public Manager(String n, double s)
	{
		super(n, s);
		bonus=1.0;
	}

	private double bonus;
}
