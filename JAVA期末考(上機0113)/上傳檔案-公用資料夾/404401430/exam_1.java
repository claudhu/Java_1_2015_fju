

import java.util.Scanner;

public class exam_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int array[] = new int [8];
		int count=0;
		for(int i=0;i<array.length;i++){
			System.out.print("enter a number:");
			array [i]=input.nextInt();
		}
		for(int j=0;j<array.length;j++){
			System.out.printf("%8d",array[j]);
			count++;
			
			if(count%4==0)
				System.out.println();
			
		}
		input.close();
		

	}

}
