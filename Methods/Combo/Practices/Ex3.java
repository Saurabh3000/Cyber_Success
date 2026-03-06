class Demo
{
	int a = 100;
	static float b = 200.5f;
}
class Ex3
{
	void m1()
	{
		Demo d1 = new Demo();
		System.out.println("Addition of M1 method = "+ (d1.a + Demo.b));
	}
	void m2()
	{
		Demo d1 = new Demo();
		System.out.println("Addition of M2 Method = "+ (d1.a + Demo.b));
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Ex3 e1 = new Ex3();
		e1.m1();
		e1.m2();
		System.out.println("Stop");
	}
}