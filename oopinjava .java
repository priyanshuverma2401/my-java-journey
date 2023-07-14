import java.util.*;
class student{
	String name;
	int age;
	public void print(){
		System.out.println("the name of student is : "+this.name);
		System.out.println("the age of the student is : "+this.age);
	}
}
public class OOPS{
	public static void main(String [] args){
		Scanner scr=new Scanner (System.in);
		System.out.println("enter number of student");
		int n = scr.nextInt();
		student st = new student();
		
			System.out.print("enter name: ");
			st.name= scr.next();
			System.out.print("\nenter age: ");
			st.age=scr.nextInt();	
	    	System.out.println("displaying details: ");
			st.print();
			System.out.println();
		
	}
}