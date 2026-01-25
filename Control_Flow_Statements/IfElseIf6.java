class IfElseIf6
{
	public static void main(String[] args)
	{
		char signal = 'o';
		
		if(signal == 'r')
		{
			System.out.println("Stop");
		}else if(signal == 'y')
		{
			System.out.println("Slow Down");
		}else if(signal == 'g')
		{
			System.out.println(" Go");
		}else
		{
			System.out.println("Invalid Signal");
		}
	}
}