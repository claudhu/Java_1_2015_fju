import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Pleases enter the number: ");
		int arr[] = new int[3];
		int j;
		for (int i = 0; i < 3; i++) {
			arr[i] = in.nextInt();
			int min = arr[i];
			int minindex = i;
			for ( j = i + 1; j < 3; j++) {
				if (min > arr[j]) {
					min = arr[j];
					minindex = j;
				}

			}
			if (j != i) {
				arr[minindex]=min;
				arr[i]=arr[minindex];
			}
			System.out.printf("%d\t", arr[i]);
		}
	}

}
