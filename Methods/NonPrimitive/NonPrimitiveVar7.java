class Demo
{
	static Demo ref;
	float x = 20.5f;
	void m1()
	{
		System.out.println("Inside M1");
	}
}
class NonPrimitiveVar7
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo.ref =  new Demo();
		System.out.println(Demo.ref);
		Demo.ref.m1();
		System.out.println("Stop");
	}
}