class NonPrimitiveVar4
{
	int a = 10;
	static NonPrimitiveVar4 ref = new NonPrimitiveVar4();
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.println(ref.a);
		System.out.println("Stop");
	}
	
}