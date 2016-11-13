import java.util.Scanner;
import java.io.File;

public class  shuru
{
	public static void main(String[] args) 
		throws Exception
	{
		Scanner scan = new Scanner(new File("def.txt"));
		int flag =0;
		long temp=0L;
		long temp1=0L;
		long temp2=0L;
		while(scan.hasNext())
		{
			if(flag==0)
			{
				 temp=scan.nextLong();
				 flag=1;
			}
			else
			{
				 temp1=scan.nextLong();
				 temp2=temp + temp1;
				System.out.println(" " + temp + " + " + " " + temp1 + " = " + temp2);
				flag=0;

			}
			

		}
		
	}
}
