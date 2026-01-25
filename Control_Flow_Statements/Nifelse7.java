class Nifelse7
{
	public static void main(String[] args)
	{
		char pro1 = 'M';
		int proQty = 20;
		
		if( pro1 == 'l')
		{
			if( proQty > 25 )
			{
				System.out.println("Purchase IT");
			}else
			{
				System.out.println(" Do not purchase Laptop ");
			}
		}else
		{
			if( proQty > 10)
			{
				System.out.println("Purchase Any other product");
			}else
			{
				System.out.println(" Do not purchase any other product");
			}
		}
	}
}