

import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the three numbers: ");
		int num = (int) input.nextInt();
		
		int[] list = {num};
		
		for(int i = 0;i<list.length-1;i++){
		   int n = list[i];
		   int nm = i;
		   for(int j=i+1;j<list.length;j++){
			      if(n < list[j])
			        n = list[j];
			        nm = j;   }
		   if(nm != i)
			   list[nm] = list[i];
		       list[i] = n;
		}
		for(int i=0;i<list.length;i++){
			System.out.print("the sorting result is as follows: ");
			System.out.printf("%3d",list[i]);
		}
		

	}

}
