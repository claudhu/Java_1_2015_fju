

public class prinf_test {

	public static void main(String[] args) {

		int[] num = {100, 100, 1000, 100000, 10, 200000, 2, 2000, 200000};
		
		for (int i = 1; i < num.length; i++) {
			
			if (i % 4 == 0 && i != 0) {
				System.out.printf("%10d\n", num[i]);
			}
			else
				System.out.printf("%10d", num[i]);
		}
		
	}

}
