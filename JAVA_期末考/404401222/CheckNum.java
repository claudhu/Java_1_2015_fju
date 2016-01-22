import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 9 digits: ");//每打一個數字需空一格
		int d10 = 0;
		int k = 0;
		int m = 0;
		for(int i = 1 ; i <= 9 ; i++){
			i = input.nextInt();
			for(int n = 1 ; n <= 9 ; n++){
			k = i * n;
			m += k;
			d10 = m % 11;
		    }
		 if(d10 != i){
			System.out.println("The checksum is: X");
		    System.out.print("The ISBN is: " + i + "X");
		 }
		 else{
		    System.out.println("The checksum is: " + d10);
		    System.out.print("The ISBN is: " + i + d10);
		 }
		}
	}

}
