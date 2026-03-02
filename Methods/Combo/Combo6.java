class Sample
{
	static float x = 20.5f;
	static void test()
	{
		System.out.println("Inside Test");
	}
}

class Combo6
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Combo6 c1 = new Combo6();
		c1.m1();
		System.out.println("Stop");
	}
	
	void m1()
	{
		System.out.println("Inside M1");
		System.out.println(Sample.x);
		Sample.test();
		Sample s1 = new Sample();
		System.out.println(s1.x);
		s1.test();
	}
}