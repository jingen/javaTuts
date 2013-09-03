package tuts;

import java.util.Scanner;
public class MyScanner {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Please input your full name:");
    String fullName = in.nextLine();
    System.out.println("Please input your age:");
    int age = in.nextInt();
    
    System.out.println("Full name is " + fullName);
    System.out.println("Your age is " + age);
    
    in.close();
  }
}
