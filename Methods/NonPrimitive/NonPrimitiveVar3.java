class NonPrimitiveVar3
{
	int a = 10;
	float b = 20.5f;
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonPrimitiveVar3 ref1 = m1();
		System.out.println("Addition in main = "+(ref1.a + ref1.b));
		System.out.println("Stop");
	}
	static NonPrimitiveVar3 m1()
	{
		System.out.println("Inside M1 method");
		NonPrimitiveVar3 ref = new NonPrimitiveVar3();
		System.out.println(ref.a + ref.b);
		return ref;
	}
}