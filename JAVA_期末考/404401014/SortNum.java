import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[3];
		System.out.printf("Please enter the three numbers: \n");
		for (int i=0; i<array.length; i++)
			array[i]=input.nextInt();
		
		for (int m=0; m<array.length; m++) {
			int currentMin=array[m];
			int currentMinIndex=m;
			
			for (int n=m+1; n<array.length; n++) {
				if (array[n]<currentMin) {
					currentMin=array[n];
					currentMinIndex=n;
				}
			}
			
			if (currentMinIndex!=m) {
				array[currentMinIndex]=array[m];
				array[m]=currentMin;
			}
		}
		
		for (int displayArray: array)
			System.out.printf("%d ", displayArray);
	}
}
