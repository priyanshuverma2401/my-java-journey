import java.util.*;
class LL {
	public static void main(String[] args) {
		LinkedList<String>list = new LinkedList<String>();
		Scanner scr = new Scanner(System.in);
		while (true) {
			System.out.print("/priyanshu/linked-list/collection/$: ");
			String str = scr.next();
			if (str.equals("addFirst")) {
				System.out.print("linked-list/list/addFirst/input:    ");
				String input = scr.next();
				list.addFirst(input);
				System.out.println(input + " added at the front.");
				
			}

			else if (str.equals("print"))
				System.out.println(list);

			else if (str.equals("addLast")) {
				System.out.println("linked-list/list/addLast/input:    ");
				String input = scr.next();
				list.addLast(input);
				System.out.println(input + " added at the end.");
			} else if (str.equals("add")) {
				System.out.println("linked-list/list/add/[position input]:    ");

				int pos = scr.nextInt();
				String input = scr.next();
				list.add(pos, input);
			} else if (str.equals("size")) {
				System.out.println("linked-list/list/size:    ");
				System.out.println(list.size());
			} else if (str.equals("trav")) {
				System.out.println("linked-list/list/travesal:    ");


				for (int i = 0; i < list.size(); i++)
					System.out.print(list.get(i) + "-->");
				System.out.print("null");
				System.out.println();
			}
			//removing elements
			else if (str.equals("removeFirst")) {
				System.out.println("linked-list/list/removeFirst   ");

				list.removeFirst();
			} else if (str.equals("removeLast")) {
				System.out.println("linked-list/list/removelast    ");

				list.removeLast();
			} else if (str.equals("remove")) {
				System.out.println("linked-list/list/remove/position/input:    ");
				int pos = scr.nextInt();

				list.remove(pos);
			} else if (str.equals("exit"))
				System.exit(0);
			else System.out.println("invalid input");
		}
	}
}