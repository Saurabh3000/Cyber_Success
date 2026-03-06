class Demo
{
	static float m2()
	{
		Cyber c1 = new Cyber();
		float res2 = c1.a + c1.b; 
		return res2;
	}
}
class Sample
{
	float m1()
	{
		Cyber c1 = new Cyber();
		float res1 = c1.a + c1.b;
		return res1;
	}
}
class Cyber
{
	int a = 100;
	static float b = 200f;
}
class Success
{
	static float result1;
	float result2;
}
class Ex6
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Sample s1 = new Sample();
		Success.result1 = s1.m1();
		
		Success s2 = new Success();
		s2.result2 = Demo.m2();
		
		float finalResult = Success.result1 + s2.result2;
		System.out.println("Final Result= "+finalResult);
		System.out.println("Stop");
	}
}