class Combo7
{
	int x = 10;
	void test()
	{
		System.out.println("Inside Test");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Combo7 c1 = new Combo7();
		c1.m1();
		System.out.println("Stop");
	}
	void m1()
	{
		System.out.println("Inside M1");
		//directly
		System.out.println(x);
		test();
		//object
		Combo7 c1 = new Combo7();
		System.out.println(c1.x);
		c1.test();
	}
}