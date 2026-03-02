class Demo
{
	int a = 10;
	void test()
	{
		System.out.println("Inside Test");
	}
}
class Combo8
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Combo8 c1 = new Combo8();
		c1.m1();
		System.out.println("Stop");
	}
	void m1()
	{
	//object 
	Demo d1 = new Demo();
	System.out.println(d1.a);
	d1.test();
	}
}
