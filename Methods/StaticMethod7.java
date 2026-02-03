class StaticMethod7
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int a = m1();
		System.out.println(a);
		System.out.println("Stop");
	}
	
	static int m1()
	{
		System.out.println("Inside");
		int a = 100;
		return a;
	}
}