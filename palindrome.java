class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int n=1221;
	  int a=n;
	  int temp=0;
	  while(a!=0)
	  {
	  	int b=a%10;
	  	a=a/10;
	  	temp=temp*10+b;
	  }
	  if(temp==n)
	  {
	  	System.out.print("Palindrome");
	  }
	  else
	  {
	  	System.out.print("Not Palindrome");
	  }
	}
}
