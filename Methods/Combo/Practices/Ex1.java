class Ex1
{
	static int a = 10;
	float b = 20.54f;
	public static void main(String[] args)
	{
		System.out.println("Start");
		Ex1 e1 = new Ex1();
		float result  = a + e1.b;
		System.out.println(result);
		e1.m1();
		System.out.println("Out");
	}
	void m1()
	{
		float result2 = a + b;
		System.out.println(result2);
	}
}