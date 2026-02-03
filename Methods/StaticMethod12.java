class StaticMethod12
{
	static float a = 20.5f;
	static void m1()
	{
		System.out.println("Inside M1");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.println(a);
		StaticMethod12.m1();
		System.out.println("Stop");
	}
}