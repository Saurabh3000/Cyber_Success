class Demo
{
	static char c = 'x';
	static void test()
	{
		System.out.println("Inside Test");
	}
}
class StaticMethod13
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.println(Demo.c);
		Demo.test();
		System.out.println("Stop");
	}
}