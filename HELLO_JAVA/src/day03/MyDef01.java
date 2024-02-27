package day03;

public class MyDef01 {
	public static void main(String[] args) {
		int sum = add(4, 2);
		System.out.println("sum : " + sum);

		int min = minus(4, 2);
		System.out.println("min : " + min);

		int mul = multiply(4, 2);
		System.out.println("mul : " + mul);

		int div = divide(4, 2);
		System.out.println("div : " + div);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		return a / b;
	}
}
