package recursion;

public class PowerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerNumber(3,3));
		System.out.println(powerNumberEffective(4,4));
	}

	private static int powerNumberEffective(int i, int j) {
		// TODO Auto-generated method stub
		if(j==0) return 1;
		if(j==1) {
			return 1;
		}else if(j%2==0) {
			return powerNumberEffective(i*i, j/2);
		}else {
			return powerNumberEffective(i*i, (j-1)/2)*i;
		}
		
	}

	private static int powerNumber(int i, int j) {
		// TODO Auto-generated method stub
		if(j==0) {
			return 1;
		}else {
			return i*powerNumber(i, j-1);
		}
	}
	
	

}
