import java.util.Scanner;
public class MoreTicket {

	
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		int x[] = new int[5];
		int count =0;
		System.out.println("請輸入需要那些種票的代碼: ");
		for(int i=0; i<x.length; i++){
			x[i] = input.nextInt();
			x[i] = (i+1);
			if(x[i]==0){
				break;
				
			}
			count++;
		}
		
		int a [] = new int[count];
		System.out.print("請輸入分別需要幾張: ");
		
		
		for(int i=0; i<a.length; i++){
			a[count] = input.nextInt();
		
		
		}
		
		
		
		
	}
}
