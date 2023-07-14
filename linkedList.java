import java.util.*;

public class LL {
    private node head;

    public class node {
        String data;
        node link;

        node(String data) {
            this.data = data;
            this.link = null;
        }
    }

    public int getLength() {
        int count = 0;
        node temp = head;
        while (temp != null) {
            count++;
            temp = temp.link;
        }
        return count;
    }

    public void addFirst(String data) {
        node newNode = new node(data);
        if (head == null) {
            System.out.println("List is empty.\nCreating a new list.");
            head = newNode;
            return;
        }

        newNode.link = head;
        head = newNode;
        
    }

    public void addLast(String data) {
        node newNode = new node(data);
        if (head == null) {
            System.out.println("List is empty.\nCreating a new list.");
            head = newNode;
            return;
        }
        node temp = head;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = newNode;
        
    }

    public void add(int i, String data) {
        node newNode = new node(data);
        int len = getLength();
        if (i < 0 || i > len) {
            System.out.println("Invalid position.");
            System.out.println("Max size: " + (len - 1) + "\nMin size: " + 0);
            return;
        }
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        node temp = head;
        int itr = 1;
        while (itr < i) {
            temp = temp.link;
            itr++;
        }
        newNode.link = temp.link;
        temp.link = newNode;
    }

    public void printList() {
        node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.link;
        }
        System.out.print("null");
        System.out.println();
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.link == null) {
            head = null;
            
            return;
        }
        node temp = head;
        node prev = null;
        while (temp.link != null) {
            prev = temp;
            temp = temp.link;
        }
        prev.link = null;
        System.out.println("Operation successful. Last element removed.");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.link;
        System.out.println("Operation successful. First element removed.");
    }

    public void removePosition(int pos) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        int len = getLength();
        if (pos < 1 || pos > len) {
            System.out.println("Invalid position.");
            System.out.println("Max position: " + len + "\nMin position: " + 1);
            return;
        }
        if (pos == 1) {
            head = head.link;
            System.out.println("Operation successful. Element at position " + pos + " removed.");
            return;
        }
        node temp = head;
        int itr = 1;
        while (itr < pos - 1) {
            temp = temp.link;
            itr++;
        }
        node nextNode = temp.link;
        temp.link = nextNode.link;
        System.out.println("Operation successful. Element at position " + pos + " removed.");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("priyanshu");
        list.printList();
        list.addFirst("my");
        list.printList();
        list.add(1,"name");
        list.printList();
        list.add(2,"is");
        list.printList();
        list.addLast("verma");
        list.printList();
    }
}
