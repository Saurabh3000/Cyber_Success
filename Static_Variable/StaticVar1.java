class StaticVar1
{
	static int a = 10;
	public static void main(String[] args)
	{	
		//Access directly
		System.out.println(a);

		//Access using class name
		System.out.println(StaticVar1.a);
	}
}