import java.util.*;
class Main{
  public static void main(String[] args){
    int a,b,c;
    char op;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of a and b");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("chose operand(+,-,*,/,%)");
    op=sc.next().charAt(0);
    switch(op){
      case '+': 
      System.out.println("addition: "+(a+b));
      break;
      case '-': 
      System.out.println("diffrence: "+(a-b));
      break;
      case '*': 
      System.out.println("multiplication: "+(a*b));
      break;
      case '/': 
      System.out.println("division: "+(a/b));
      break;
      case '%': 
      System.out.println("mod: "+(a%b));
      break;
      default:
      System.out.println("invalid input");
  }
  }
}
