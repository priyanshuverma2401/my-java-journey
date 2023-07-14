
import java.util.*;
public class Main{
  public static void main(String[] args){
    float marks;
    boolean choice;
    Scanner scr= new Scanner(System.in);
    do{
      System.out.println("enter students mark");
      marks=scr.nextFloat();
      if(marks>=90) 
      System.out.println("this is good");
      else if(marks<=89&&marks>=60)
      System.out.println("this is also good");
      else
      System.out.println("this is also good because effort matters marks no");
      System.out.println("do you want to continue<0/1>");
       choice=scr.nextBoolean();
    }
    while(choice);
    System.out.println("program ended");
  }
}
