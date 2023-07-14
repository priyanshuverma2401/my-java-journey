import java.util.*;
public class Main {
	public static void main(String[] args) {
		Stack<String> stk= new Stack<>();
		stk.push("verma");
		stk.push("priyanshu");
		stk.push("is");
		stk.push("name");
		stk.push("My");
		while(!(stk.isEmpty()))
		System.out.println(stk.pop());
		
	}
}