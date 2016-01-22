public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num1, num2;
		int arr[]=new int[9];
		int index;
		System.out.println("The perfect numbers that are less than 1000 are: ");
		for (i = 1; i <= 1000; i++) {
			for (int j = 0; j < 9; j++) {
				arr[j]=j+1;
				if (i % arr[j]== 0) {
					num1 = i / arr[j];
					num2 = num1 / arr[j];
					index=j;
					if (i == num1 + num2 + 1) {
						System.out.printf("%d\t", i);
					}
				}
			}
			
		}
	}

}
