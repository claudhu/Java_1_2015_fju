import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a numbers : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++){
			for(int j = 1 ; j <= i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
