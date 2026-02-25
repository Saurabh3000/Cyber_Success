class NonPrimitiveVar6
{
	char x = 'a';
	static NonPrimitiveVar6 ref;
	public static void main(String[] args)
	{
		System.out.println("Start");
		ref = new NonPrimitiveVar6();
		m1();
		System.out.println("Stop");
	}
	static void m1()
	{
		System.out.println("Inside M1");
		System.out.println(ref.x);
	}
}