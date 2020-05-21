package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(6));
	}

	private static int fact(int i) {
		// TODO Auto-generated method stub
		if(i==0) {
			return 1;
		}
		return fact(i-1)*i;
	}
	

}
