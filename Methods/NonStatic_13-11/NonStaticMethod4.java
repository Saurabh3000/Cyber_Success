class NonStaticMethod4
{
	static void m1()
	{
		System.out.println("Inside Static M1 Method");
	}
	void m2()
	{
		System.out.println("Inside Non-Static Method M2");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Start");
		m1();
		NonStaticMethod4 ref = new NonStaticMethod4();
		ref.m2();
		System.out.println("Stop");
	}
}