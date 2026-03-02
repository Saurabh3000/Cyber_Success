class Combo3
{
	float a = 10.5f;
	void m1()
	{
		System.out.println("Inside M1 Method");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Start");
		
		//object
		Combo3 c1 = new Combo3();	
		System.out.println(c1.a);
		c1.m1();
		
		System.out.println("Stop");
	}
}