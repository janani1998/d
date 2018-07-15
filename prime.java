class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int n=1222,count=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.print("YES PRIME NUMBER");
		}
		else
		{
			System.out.print("NO NOT A PRIME NUMBER");
		}
	}
}
