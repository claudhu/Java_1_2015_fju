



import java.util.Arrays;
import java.util.Scanner;

public class SortNum {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("請輸入三個整數");
		int[]x = new int[3];
		int y=input.nextInt();
		Arrays.sort(x);
		System.out.print(x);
	}

}
