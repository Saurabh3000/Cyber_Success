class Demo
{
	static int a = 10;
	
	static void m1()
	{
		System.out.println("Inside M1 Method");
	}
}
class Combo2
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		//classname
		System.out.println(Demo.a);
		Demo.m1();
		
		//object
		Demo d1 = new Demo();
		System.out.println(d1.a);
		d1.m1();
		
		System.out.println("Stop");
	}
}