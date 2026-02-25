class Demo
{
	char x = 'a';
	Demo refvar;
	void test()
	{
		System.out.println("Inside Test methd = "+x);
	}
}

class NonPrimitiveVar11
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo d = new Demo();
		d.refvar = new Demo();
		d.refvar.test();
		System.out.println("Stop");
	}
}