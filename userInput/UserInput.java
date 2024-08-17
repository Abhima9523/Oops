package userInput;

import java.util.*;

public class UserInput 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("enter yor age");
		int age=sc.nextInt();
		System.out.println("enter your experience");
		double exp=sc.nextDouble();
		System.out.println("name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Experience  :"+exp);
		
	}

}
