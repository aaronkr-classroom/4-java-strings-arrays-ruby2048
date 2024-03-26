public class Ex502 {
	public static double add(double a , double b) {
		return a + b;
	}
	
	public static double sub(double a , double b) {
		return a - b;
	}
	
	public static double mult(double a , double b) {
		return a * b;
	}
	
	public static double div(double a , double b) {
		return a / b;
	}
	
	public static double max(double a , double b) {
		if (a >= b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static double min(double a , double b) {
		if (a <= b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static void factorial(int a) {
		int result = 1;
		for (int i = 1; i <= a; i++) {
			result *= i;
		}
		System.out.println("Factorial of " + a + "! " + result);
	}
	
	public static void circ(int a) {
		String result = "Pizza circ : " + 2 * a* 3.14 + " inches";
		System.out.println(result);
	}
	
	public static void circ(double a) {
		String result = "Pizza circ : " + 2 * a* 3.14 + " inches";
		System.out.println(result);
	}
	
	public static void area(int a) {
		String result = "Pizza area : " + a * a* 3.14 + " inches";
		System.out.println(result);
	}
	
	public static void area(double a) {
		String result = "Pizza area : " + a * a* 3.14 + " inches";
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int a = 15;
		int b = 7;
		
		factorial(a);
		factorial(b);
		
		System.out.println("Calculator program : ");
		System.out.println("Add : " + a + " + " + b + " = " + add(a,b));
		System.out.println("Subtract : " + a + " - " + b + " = " + sub(a,b));
		System.out.println("Multiply : " + a + " * " + b + " = " + mult(a,b));
		System.out.println("divide : " + a + " / " + b + " = " + div(a,b));
		System.out.println("Max ( " + a + " , " + b + " ) : " + max(a,b));
		System.out.println("divide ( " + a + " , " + b + " ) : " + min(a,b));
		circ(a);
		area(a);
		
		circ(12);
		circ(1.24567);
		float c = 12.345f;
		circ(c);
	}
}