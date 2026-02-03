class StaticMethod6
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int length = 10, breadth = 2;
		areaofreactangle(length,breadth);
		System.out.println("Stop");
	}
	
	static void areaofreactangle(int l, int b)
	{
		System.out.println("Inside");
		int area = l * b;
		System.out.println("Area of Reactangle is = "+area);
	}
}