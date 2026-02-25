class NonPrimitiveVar13
{
	int a = 10;
	float b = 20.5f;
	static void m1(NonPrimitiveVar13 ref)
	{
		System.out.println("Inside M1 method");
		System.out.println(ref.a);
		System.out.println(ref.b);
	}
	static void test1(NonPrimitiveVar13 ref1)
	{
		System.out.println("Inside Test method");
		System.out.println(ref1.a);
		System.out.println(ref1.b);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Start");
		//Named object
		NonPrimitiveVar13 ref = new NonPrimitiveVar13();
		m1(ref);
		
		//Nameless object
		test1(new NonPrimitiveVar13());
		System.out.println("Stop");
	}
}
