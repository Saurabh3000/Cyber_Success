class Combo1
{
	static int a = 10;
	static void m1()
	{
		System.out.println("Inside Static Method");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		//Directly
		System.out.println(a);
		m1();
		
		//classname
		System.out.println(Combo1.a);
		Combo1.m1();
		
		//object
		Combo1 c1 = new Combo1();
		System.out.println(c1.a);
		c1.m1();
		
		System.out.println("Stop");
	}
}