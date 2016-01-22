
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a numbers : ");
		int a = input.nextInt();
		System.out.println("Your square looks likes : ");
	
		for(int k=0 ; k<a ; k++)
		{
		  for(int i=0 ; i<a ;i++){
			if(i<=k)
			   System.out.print("*");
		}
		for(int j=a ; j>0 ; j--){
			    if(j<a-k)
				System.out.print("бн");
		}
		System.out.println();
		}
			
		}}
			
		

	


