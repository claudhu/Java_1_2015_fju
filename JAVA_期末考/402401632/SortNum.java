
import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] rndnum = new int[3];

		System.out.println("Please enter the three numbers¡G");
		for (int i = 0; i < rndnum.length; i++) {
			rndnum[i] = input.nextInt();
		}

		System.out.println("The sorting result is as follows¡G");
		sorting(rndnum);
	}

	public static void sorting(int[] list){
		int max = 0;
		int min = 100;
		int center = list[1];
		for (int j = 0; j < list.length; j++) {
			if (list[j] > max) {
				max = list[j];
			}
			else if (list[j] < min) {
				min = list[j];
			}
			if (list[j] > max && list[j] < min) {
				center = list[j];
			}
		}
		System.out.printf("%d %4d %4d", min, center, max);
	}
}
