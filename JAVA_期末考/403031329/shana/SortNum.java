
import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.println("Please enter three numbers: ");
		int n[]=new int[3];
		
		for(int i=0;i<=n.length-1;i++){
			for(int j=0;j<n.length;j++){
				if(n[i]>n[j]){
				int temp;
				temp=n[i];
				n[i]=n[j];
				n[j]=temp;
			}
		
				

			}
			}
		int num=input.nextInt();

				for(int i =0;i<=n.length-1;i++){
					System.out.println("The sorting result is as follows: "+n[i]);
		}

	}
		
	
	}
