package calc;

import java.util.*;

public class Reader {
int a,b;
String operator;
Scanner scn;

public void scan(){
	scn = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	a=Integer.parseInt(scn.nextLine());
	
	System.out.print("Select one operator: +, -, *, /: ");
	operator=scn.nextLine();
	
	System.out.print("Enter second number: ");
	b=Integer.parseInt(scn.nextLine());
	
}
	
}
