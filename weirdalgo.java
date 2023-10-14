import java.util.Scanner;
public class wierdalgo {
public static void main (String[]args)
{
	Scanner s=new Scanner(System.in);
	long number=Integer.parseInt(s.nextLine());
	while(number>1)
	{
		System.out.print(number + " ");
		if(number%2==1)
		{
			number=number*3+1;
		}else {
			number/=2;
		}
	}
	System.out.print(number);
}
}
