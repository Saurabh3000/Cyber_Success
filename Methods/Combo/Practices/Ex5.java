class Demo
{
	int a = 100;
	static float m2()
	{
		Demo d1 = new Demo();
		float res2 = d1.a + Sample.b;
		return res2;
	}
}
class Sample
{
	static float b = 200.5f;
	float m1()
	{
		Demo d1 = new Demo();
		float res1 = d1.a + b;
		return res1;
	}
}
class Ex5
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Sample s1 = new Sample();
		float res1 = s1.m1();
		Demo d1 = new Demo();
		float res2 = d1.m2();
		float finalResult = res1 + res2;
		System.out.println("Final Result = "+finalResult);
		System.out.println("Stop");
	}
}