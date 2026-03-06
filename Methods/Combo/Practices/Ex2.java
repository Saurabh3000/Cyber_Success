class Ex2
{	
	static int a = 10;
	float b = 200.5f;
	
	int m1(int var1)
	{
		System.out.println("Insdie M1");
		int result1 = a + var1;
		return result1;
	}
	
	static float m2(float var2)
	{
		System.out.println("Inside M2");
		Ex2 e1 = new Ex2();
		float result2 = e1.b + var2;
		return result2;
	}
	public static void main(String[] args)
	{
		int var1 = 10;
		float var2 = 20.5f;
		Ex2 e1 = new Ex2();
		int result1 =e1.m1(var1);
		float result2 = m2(var2);
		float finalResult = result1 + result2;
		System.out.println("Final Result is = "+finalResult);
	}
}