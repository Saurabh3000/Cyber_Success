class NonStaticMethod1
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonStaticMethod1 ref = new NonStaticMethod1();
		ref.m1();
		System.out.println("Stop");
	}
	void m1()
	{
		System.out.println("Inside M1");
	}
}