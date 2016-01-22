import java.util.Scanner;
public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] x = new int[8];
		System.out.println("Please enter 8 numbers : ");
		for(int i = 0 ; i < x.length ; i ++){
			x[i] = input.nextInt();
		}
		int count = 0 ; 
		for(int j = 0 ;  j < x.length ; j++){
			System.out.printf("%8d",x[j]);
			count++;
			if(count % 4 == 0 ){
				System.out.println();
			}
		}
		input.close();
	}

}
