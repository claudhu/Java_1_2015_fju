import java.util.*;
public class SortNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[3];
		System.out.printf("Please enter the three numbers :\n");
		for(int i=0; i<array.length; i++)
			array[i] = input.nextInt();
		System.out.printf("The sorting result is as follows :\n");
		for(int j=0; j<array.length; j++){
			for(int i=j+1; i<array.length; i++){
			if(array[j]>array[i]){
				int min = array[j];
				array[j] = array[i];
				array[i] = min;
			}
		}
     }
		for(int i=0; i<array.length; i++)
			System.out.printf("%-3d",array[i]);
	}
}
