

import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the three numbers:");
		int i[] = new int[3];
		
		for(int a=0;a<i.length;a++){
			i[a] =  input.nextInt();
			}
		
		System.out.println("The sorting result is as follows:\n"+i);
		

	}

}
