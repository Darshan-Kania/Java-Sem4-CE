import java.util.*;
class PrintNumbers
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
				System.out.println(i);
		}
	}
}