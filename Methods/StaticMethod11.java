class StaticMethod11
{
	static float var1 = 20.5f;
	public static void main(String[] args)
	{
		System.out.println("Start");
		int a = 10;
		System.out.println(a);
		System.out.println(var1);
		System.out.println(StaticMethod11.var1);
		System.out.println("Stop");
	}
}