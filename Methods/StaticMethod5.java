class StaticMethod5
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int a = 100;
		m1(a);
		System.out.println("Stop");
	}
	
	static void m1(int a)
	{
		System.out.println("Inside");
		System.out.println(a);
	}
}