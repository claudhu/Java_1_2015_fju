

import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the three numbers:");
		int list[] =new int[3];
		for(int i =0;i<list.length;i++){
			list[i]=input.nextInt();
			
		}
		System.out.println("the sorting result is as follows:");
		for(int i =0;i<list.length;i++){
			int min =list[i];
			int index=i;
			for(int j =i+1;j<list.length;j++){
				if(min>list[j]){
					min=list[j];
					index=j;
				}
				if(index!=i){
					list[index]=list[i];
					list[i]=min;
				}}
				System.out.print(list[i]+" ");
			
	
				
			}
		
		

	}

}
