class Increment1
{
	public static void main(String[] args)
	{
		int a = 1;
		
		System.out.println("Increment");
		System.out.println(a); // 1
		System.out.println(++a);// print 2 --> Increment 2
		System.out.println(a); // print 2
		System.out.println(a++); // print 2 ---> Increment 3
		System.out.println(a); // print 3
		
		int b = 3;
		System.out.println("Decrement");
		System.out.println(b); // print 3
		System.out.println(--b); // print 2 ---> decrement 2
		System.out.println(b); // print 2
		System.out.println(b--); //print 2 ---> decrement 1
		System.out.println(b); //print 1
	}
}