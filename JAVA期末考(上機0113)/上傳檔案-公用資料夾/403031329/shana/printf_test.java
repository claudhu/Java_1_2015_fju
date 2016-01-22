
import java.util.Scanner;
public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num[]=new int[8];
		Scanner input= new Scanner(System.in);
		
		System.out.println("輸入8個整數: ");
		int n= input.nextInt();
		
		
		for(int i=0; i<num.length-1;i++){
		   num[i]=input.nextInt();
		   
			
		
		}
		int count=0;

	   for(int i=0; i<num.length;i++){
		   
		   System.out.print(num[i]+" ");
		   count++;
		   if(count%4==0){
			   System.out.println();
			   count=0;
		   }
	}

}}
