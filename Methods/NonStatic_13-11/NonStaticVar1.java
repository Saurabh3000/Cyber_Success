class NonStaticVar1
{
	int a = 10;
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonStaticVar1 var1 = new NonStaticVar1();
		System.out.println(var1.a);
		System.out.println("Stop");
	}
}