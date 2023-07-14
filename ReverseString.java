// java programm to reverse a string;
import java.util.*;
public class reverseString{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter any string");
		StringBuilder str = new StringBuilder(scr.nextLine());
		str.append(scr.nextLine());
		System.out.println("Origional string: "+str);
		for (int i=0;i<str.length()/2;i++)
		{
			int front=i;
			int back=str.length()-1-i;
			char frontChar=str.charAt(front);
			char backChar=str.charAt(back);
			str.setCharAt(front, backChar);
			str.setCharAt(back, frontChar);
		}
		System.out.println("After reversing: "+str);
	}
}