class Cyber
{
	static float a = 10.5f;
}
class Success
{
	static int b = 20;
}
class Demo
{
	static float result;
}
class StaticVar5
{
	public static void main(String[] args)
	{
		Demo.result = Cyber.a + Success.b;
		
		System.out.println("Addition is = "+Demo.result);
	}
}