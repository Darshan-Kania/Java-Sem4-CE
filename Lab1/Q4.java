import java.util.*;
class DetailsStudent
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int rollNo;
		List<Integer> li = new ArrayList<>();
		name=sc.nextLine();
		rollNo=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			li.add(sc.nextInt());
		}
		int sum=0;
		int avg=0;
		for(int i=0;i<5;i++)
			sum+=li.get(i);
		avg=sum/5;
		System.out.println("Name:"+ name);
		System.out.println("Roll No:"+ rollNo);
		System.out.println("Average:"+ avg);
		if(avg>90)
		{
			System.out.println("Grade :A");
		}else if(avg<90&&avg>75)
		{
			System.out.println("Grade :B");
		}else if(avg<75&&avg>60)
		{
			System.out.println("Grade :C");
		}else
			System.out.println("Grade :F");
	}
}