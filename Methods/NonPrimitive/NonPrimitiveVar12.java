class NonPrimitiveVar12
{
	int a = 100;
	public static void main(String[] args)
	{
		System.out.println("Start");
		//Named Object 
		NonPrimitiveVar12 ref = new NonPrimitiveVar12();
		System.out.println(ref.a);
		
		//Nameless object
		System.out.println(new NonPrimitiveVar12().a);
		System.out.println("Stop");
	}
}