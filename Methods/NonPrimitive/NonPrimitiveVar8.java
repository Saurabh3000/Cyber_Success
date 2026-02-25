class System1
{
	static System1 out1;
	void println1(String info)
	{
		System.out.println(info);
	}
}
class NonPrimitiveVar8
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		System1.out1 = new System1();
		System1.out1.println1("Inside Printlnln method");
		System.out.println("Stop");
	}
}