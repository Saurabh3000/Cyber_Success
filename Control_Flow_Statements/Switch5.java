// Duplicate case are not allowed.

class Switch5
{
	public static void main(String[] args)
	{
		int x = 10;
		
		switch(x)
		{
			case 100: System.out.println("A");
			
			case 100: System.out.println("B");
		}
	}
}