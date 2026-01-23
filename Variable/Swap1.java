class Swap1
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = 20;
		System.out.println(x);
		System.out.println(y);
		System.out.println("-----------------------------");

		y = y - x;
		x = x + y;
		System.out.println(x);
		System.out.println(y);

	}
}