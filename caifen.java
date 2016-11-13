import java.lang.String;
public class  caifen
{
	public static void main(String[] args) 
	{
		int [] b= new int[8];
		char [] c =new char[8];
		String a = "A1B2C3D4E5F6G7H8";
		for(int i=0;i<8;i++)
		{
			int j= i*2+1;
			int f= 2*i;
			b[i]=a.charAt(j)-'0';
			c[i]=a.charAt(f);
		
		}
	
		for(int temp:b)
		{
				System.out.print(temp + " ");

		}
				System.out.println();
		
		for(char temp1:c)
		{
				System.out.print(temp1);

		}

	
	}
}
