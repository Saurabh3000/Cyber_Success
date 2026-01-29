class Sample
{
	static int a = 10;
}
class StaticVar4
{
	static float b = 20.05f;
	public static void main(String[] args)
	{
		float result = Sample.a + b;
		System.out.println(result);
	}
}