package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib(6);
	}

	private static int fib(int i) {
		// TODO Auto-generated method stub
		if(i<=1) {
			System.out.println(i);
			return i;
		}
		else {
			int num= fib(i-2)+fib(i-1);
			System.out.println(num);
			return num;
		}
	}

}
