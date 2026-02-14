class Sample
{
	int m1(int x)
	{
		System.out.println("Inside M1");
		int result1 = x + 10;
		return result1;
	}
	float m2(float y)
	{
		System.out.println("Inside M2");
		float result2 = y + 20.5f;
		return result2;
	}
}
class NonStaticMethod3
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int x = 10;
		float y = 20.5f;
		Sample s1 = new Sample();
		int result1 = s1.m1(x);
		float result2 = s1.m2(y);
		float finalResult = result1 + result2;
		System.out.println("Final Resut is = "+finalResult);
		System.out.println("Stop");
	}
}