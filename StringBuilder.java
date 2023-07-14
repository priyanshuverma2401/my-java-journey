import java.util.*;
public class StringBuilders {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("priyanshu");
		//get character from index;
	for(int i=0;i<sb.length();i++)
	System.out.println(sb.charAt(i));
	//set char at index;
	sb.setCharAt(0,'S');
	System.out.println(sb);
	//insert character at;
	sb.insert(0,'s');
	System.out.println(sb);
	//delete character at some index;
	sb.delete(0,2);
	sb.insert(0,'P');
	System.out.println(sb);
	}
}