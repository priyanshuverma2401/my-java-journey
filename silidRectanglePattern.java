import java.util.*;
class Main{
	public static void main(String[] args) 
	{
		//printing solid rectangle
		/*
		output: 
		*****
		*****
		*****
		*****
		*/
		int row,col;
		System.out.println("enter the value of rows  and column: ");
	
	Scanner scr=new Scanner(System.in);
	row=scr.nextInt();
	col=scr.nextInt();
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=col;j++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	
     }
}