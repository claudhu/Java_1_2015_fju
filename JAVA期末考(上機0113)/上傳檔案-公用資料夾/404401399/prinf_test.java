
import java.util.Scanner;
public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 8 numbers :");
		int num[] = new int[8];
		for(int i = 0; i<num.length;i++){
		num[i]=input.nextInt();
		}
		for(int j=0;j<num.length;j++){
			if(j==3){
				System.out.printf("%10d",num[j]);
			    System.out.println();
			}
			else{
				System.out.printf("%10d",num[j]);
		}

	}

}}
