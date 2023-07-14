import java.util.*;
public class Main {
	public static void main(String[] args) {
		//printing hollow rectangle
		/*output: 
		*********
		*            *
		*            *
		*            *
		*********
		*/
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter rows and column: ");
		int row = scr.nextInt();
		int col = scr.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1||j==1||i==row||j==col)
				System.out.print("*");
				else
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}