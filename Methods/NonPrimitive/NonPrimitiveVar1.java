class NonPrimitiveVar1
{
	int a = 100;
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonPrimitiveVar1 ref = new NonPrimitiveVar1();
		//here local references varibale is also know as NonPrimitive Variable.
		System.out.println(ref.a);
		System.out.println("Stop");
	}
}