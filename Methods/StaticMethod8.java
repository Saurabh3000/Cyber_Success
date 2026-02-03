class StaticMethod8
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int num1=10, num2=20;
		int add=addition(num1, num2);
		System.out.println("Addition is  = "+add);
		System.out.println("Stop");
	}
	
	static int addition(int n1, int n2)
	{
		System.out.println("Inside");
		int add = n1 + n2;
		return add;
	}
}