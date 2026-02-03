class Demo
{
	static int m1(int var1)
	{
		int result1 = var1 +10;
		return result1;
	}
	
	static float m2(float var2)
	{
		float result2 = var2 +20.05f;
		return result2;
	}
}

class StaticMethod9
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int var1 = 100;
		float var2=200.05f;
		int result1 = Demo.m1(var1);
		float result2 = Demo.m2(var2);
		float finalresult = result1 + result2;
		System.out.println("Final Result is = "+finalresult);
		System.out.println("Stop");
	}
}