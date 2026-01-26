class While2
{
	public static void main(String[] args)
	{
		int i=1;
		while(i<=5)
		{
			if(i%2==0)
			{
				System.out.println("Even = "+i);
			}else
			{
				System.out.println("Odd = "+i);
			}
			i++;
		}
	}
}
