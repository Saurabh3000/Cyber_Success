class Demo
{
	float b = 20.5f;
	
	void m1()
	{
		System.out.println("Inside M1");
	}
}
class Combo4
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		
		//object
		Demo d1 = new Demo();
		System.out.println(d1.b);
		d1.m1();
		
		System.out.println("Stop");
	}
}
