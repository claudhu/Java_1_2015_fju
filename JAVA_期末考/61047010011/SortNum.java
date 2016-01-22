

import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		int[] list = new int[3];
		System.out.println("Please enter the three numbers:");
		
		for(int i=0;i<list.length;i++) {
			list[i]=input.nextInt();
		}
		selectionSort(list);
		System.out.println("The sorting result is as follows:");
		for(int j=0;j<list.length;j++) {
			System.out.printf("%d ",list[j]);
		}
	}
	
	public static void selectionSort(int[] list) {
		for(int i=0; i<list.length-1;i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for(int j=i+1;j<list.length;j++) {
				if(currentMin > list[j]) {
					currentMin = list[j];
				    currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i ) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;		
			}
		}
	}

}
