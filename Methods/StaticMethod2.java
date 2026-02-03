class StaticMethod2
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		m1();
		System.out.println("Stop");
	}
	
	static void m1()
	{
		System.out.println("Inside M1");
		return;
		return;
	}
}