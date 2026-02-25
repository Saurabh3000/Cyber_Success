class This1
{
	int a = 100;
	void m1(int a)
	{
		System.out.println("Inside M1 method");
		System.out.println(a);
		
		//1st approch is object creation
		This1 ref2 = new This1();
		System.out.println(ref2.a);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Start");
		This1 ref1 = new This1();
		ref1.m1(10);
		System.out.println("Stop");
	}
}