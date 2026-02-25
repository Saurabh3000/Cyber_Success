class This2
{
	int a = 100;
	void m1(int a)
	{
		System.out.println("Inside M1 method");
		System.out.println(a);
		
		//2nd approch is this keyword
		System.out.println(this.a);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		This2 ref1 = new This2();
		ref1.m1(10);
		System.out.println("Stop");
	}
}