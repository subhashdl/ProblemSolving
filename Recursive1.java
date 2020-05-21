package recursion;

public class Recursive1 {
	static int i=0,j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(3);
	}

	private static void fun(int i) {
		// TODO Auto-generated method stub
		if(i>0) {
			fun(i-1);
			System.out.println(i);
		}
	}
}
