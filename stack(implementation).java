import java.util.*;
public class Stacks{
	node head;
	class node{
		int data;
		node link;
		node(int data){
			this.data=data;
			this.link=null;
		}
	}
	public boolean isEmpty(){
		if(head==null) 
		return true;
		else
		return false;
	}
	public void push(int data){
		node newNode= new node(data);
		if(head==null){
			head=newNode;
			return;
		}
		newNode.link=head;
		head=newNode;
	}
	public int peek(){
		return head.data;
	}
	public int pop(){
		int top=peek();
		head=head.link;
		return top;
	}
	public static void main(String[] args) {
		Stacks s1=new Stacks();
		s1.push(5);
		s1.push(3);
		s1.push(67);
		s1.push(63);
		s1.push(6);
		while(!(s1.isEmpty()))
		System.out.println(s1.pop());
		
	}
}