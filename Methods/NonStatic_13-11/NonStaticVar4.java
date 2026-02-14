class Demo
{
	float b = 20.5f;
}
class NonStaticVar4
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo d1 = new Demo();
		System.out.println(d1.b);
		System.out.println("Stop");
	}
}