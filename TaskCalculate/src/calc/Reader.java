package calc;

import java.util.*;

public class Reader {
int a,b;
String readLineFirst,readLineSecond;
String operator;
Scanner scn;
static RomanNumber rNumber;

	public void scan(){
		scn = new Scanner(System.in);
		rNumber = new RomanNumber();
		
		System.out.print("Enter first number: ");
		readLineFirst=scn.nextLine();
		
		System.out.print("Select one operator: +, -, *, /: ");
		operator=scn.nextLine();
		
		System.out.print("Enter second number: ");
		readLineSecond = scn.nextLine();
				
				
		if (isNumeric(readLineFirst)==true && isNumeric(readLineSecond)==true){
			a=Integer.parseInt(readLineFirst);	
			b=Integer.parseInt(readLineSecond);
		} else {
			 a=rNumber.romanToDecimal(readLineFirst);
			 b=rNumber.romanToDecimal(readLineSecond);
		}
	}

		public boolean isNumeric(String s) {
		    int len = s.length();
		    for (int i = 0; i < len; ++i) {
		        if (!Character.isDigit(s.charAt(i))) {
		            return false;
		        }
		    }
		    return true;
		}

}
