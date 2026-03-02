class Combo5
{
	static int a = 10;
	static void test()
	{
		System.out.println("Inside Test Method");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Start");
		
		//object
		Combo5 c1 = new Combo5();
		c1.m1();
		
		System.out.println("Stop");
	}
	
	void m1()
	{
		//Directly 
		System.out.println(a);
		test();
		
		//classname
		System.out.println(Combo5.a);
		Combo5.test();
		
		//object
		Combo5 c1 = new Combo5();
		System.out.println(c1.a);
		c1.test();
	}
}