import java.util.Scanner;
import java.util.Random;
import java.util.TreeSet;
public class suiji 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		Random random=new Random();
		TreeSet ts =new TreeSet((o1,o2)->
		{
			int b=(int)o1;
			int c=(int)o2;
			return b > c ? -1 : b < c ? 1 : 0;
		});
		int  sum =0;
		for(int i=0;i<n;i++)
		{
			int a=random.nextInt();
			ts.add(a);
			

		}
		System.out.println("遍历的数组是");
		for (Object  temp : ts )
		{

			System.out.println(temp);
			sum=sum +(int)temp;
		}
				
				
				int average=sum/n;

		System.out.println("求得的总数是" + sum);
		System.out.println("求得的平均数是" + average);
	}
}
