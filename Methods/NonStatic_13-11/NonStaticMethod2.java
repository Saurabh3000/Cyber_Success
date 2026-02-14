class NonStaticMethod2
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int var1 = 10;
		float var2 = 20.5f;
		NonStaticMethod2 ref = new NonStaticMethod2();
		float result = ref.m1(var1, var2);
		System.out.println("Final Result = "+result);
		System.out.println("Stop");
	}
	
	float m1(int var1, float var2)
	{
		System.out.println("Inside M1");
		float result = var1 + var2;
		return result;
	}
}