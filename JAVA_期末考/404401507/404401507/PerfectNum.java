public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out
				.println("The perfect numbers that  are less than 10000 are: ");
		for (int i = 2; i < 10001; i++) {
			int sum = 0;
			for (int k = 1; k < i; k++) {
				if (i % k == 0) {
					k++;
					sum += k;
				}

				if (sum == i) {
					System.out.println(sum);

				}

			}
		}
	}
}
