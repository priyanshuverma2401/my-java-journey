import java.util.*;
public class Main {
	public static void main(String[] args) {
		/*printing half pyramid
		output:
    	*
		**
		***
		****
		*****
		*/
		System.out.println("Enter total number of **");
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}