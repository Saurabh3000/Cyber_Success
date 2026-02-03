class Demo
{
	static int x = 100;
}
class Sample
{
	static void test()
	{
		System.out.println("Inside Test");
	}	
}

class StaticMethod14
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.print(Demo.x);
		Sample.test();
		System.out.println("Out");
	}
}