import java.util.Scanner;
public class MoreTicket {

	
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		int x[] = new int[5];
		int count =0;
		System.out.println("�п�J�ݭn���Ǻز����N�X: ");
		for(int i=0; i<x.length; i++){
			x[i] = input.nextInt();
			x[i] = (i+1);
			if(x[i]==0){
				break;
				
			}
			count++;
		}
		
		int a [] = new int[count];
		System.out.print("�п�J���O�ݭn�X�i: ");
		
		
		for(int i=0; i<a.length; i++){
			a[count] = input.nextInt();
		
		
		}
		
		
		
		
	}
}
