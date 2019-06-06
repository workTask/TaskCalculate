package calc;



public class Main {
static Calculate calc;
static Reader reader;

	public static void main(String[] args) {
		calc = new Calculate();
		reader = new Reader();
		
		System.out.println("Calculate v1");
		reader.scan();
		
		
		if (reader.operator.equals("+")){
			System.out.println(calc.add(reader.a,reader.b));
		}
		if (reader.operator.equals("-")){
			System.out.println(calc.subtract(reader.a,reader.b));
		}
		if (reader.operator.equals("*")){
			System.out.println(calc.multiply(reader.a,reader.b));
		}
		if (reader.operator.equals("/")){
			System.out.println(calc.divide(reader.a,reader.b));
		}
		if(!reader.operator.equals("/") || !reader.operator.equals("*") || !reader.operator.equals("-") || reader.operator.equals("+") ){
			System.out.println("Enter operator is invalid");
			System.out.println("Try again");		
		}
		
	}

}
