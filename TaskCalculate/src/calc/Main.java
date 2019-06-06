package calc;



public class Main {
static Calculate calc;
static Reader reader;
static RomanNumber rNumber;


	public static void main(String[] args) {
		calc = new Calculate();
		reader = new Reader();
		rNumber = new RomanNumber();
	
		System.out.println("Calculate v1");
		reader.scan();
			if (reader.isNumeric(reader.readLineFirst)==true && reader.isNumeric(reader.readLineSecond)==true){
				if (reader.operator.equals("+")){
					System.out.println(calc.add(reader.a,reader.b));
				} else if (reader.operator.equals("-")){
					System.out.println(calc.subtract(reader.a,reader.b));
				} else if (reader.operator.equals("*")){
					System.out.println(calc.multiply(reader.a,reader.b));
				} else if (reader.operator.equals("/")){
					System.out.println(calc.divide(reader.a,reader.b));
				} else if(!reader.operator.equals("/") || !reader.operator.equals("*") || !reader.operator.equals("-") || reader.operator.equals("+") ){
					System.out.println("Entered operator is invalid");
					System.out.println("Try again");		
				}
			} else {
				if (reader.operator.equals("+")){
					int addNum = calc.add(reader.a,reader.b);
					System.out.println(rNumber.decimalToRoman(addNum));
				} else if (reader.operator.equals("-")){
					int subtractNum = calc.subtract(reader.a,reader.b);
					System.out.println(rNumber.decimalToRoman(subtractNum));
				} else if (reader.operator.equals("*")){
					int multiplyNum =calc.multiply(reader.a,reader.b);
					System.out.println(rNumber.decimalToRoman(multiplyNum));
				} else if (reader.operator.equals("/")){
					int divideNum = calc.divide(reader.a,reader.b);
					System.out.println(rNumber.decimalToRoman(divideNum));
				} 
			}		
	}
}

