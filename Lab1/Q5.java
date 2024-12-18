import java.util.*;
class Sum
{
	static public int calculateSumOfEvenNumbers(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[];
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans=Sum.calculateSumOfEvenNumbers(arr);
		System.out.println("Sum is "+ ans);
	}
}