import java.util.*;
public class Main {
	public static void main(String[] args) {
		/*
		printing inverted and rotated half pyramid
		output:

        *
      * *
    * * *
  * * * *
* * * * *

		*/
		System.out.print("Enter n: ");
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}