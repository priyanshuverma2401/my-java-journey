import java.util.*;
public class Main {
	public static void main(String[] args) {
		//inverted half pyramid
		/* output:
		
* * * * *
* * * *
* * *
* *
*
		*/
		System.out.println("Enter the number of stars: ");
		Scanner scr=new Scanner(System.in);
		int num=scr.nextInt();
		for(int i=num;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}