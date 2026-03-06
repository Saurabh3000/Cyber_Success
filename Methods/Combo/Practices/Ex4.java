class Demo
{
	int a = 100;
	static float b = 200.5f;
	float m1()
	{
		float res1 = a + b;
		return res1;
	}
	float m2()
	{
		float res2 = a + b;
		return res2;
	}
	
}
class Ex4
{
	static float result1;
	float result2;
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo d1 = new Demo();
		result1 = d1.m1();
		Ex4 e1 = new Ex4();
		 e1.result2 = d1.m2();
		float finalResult = result1 + e1.result2;
		System.out.println("Final Result is = "+finalResult);
		System.out.println("Stop");
	}
}