import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the three numbers : ");
		int[] n = new int[3];
		
		for(int i = 0 ; i < 3 ; i ++){
			n[i] = input.nextInt();
		}
		System.out.println("The sorting result is as follows :");
		int a = Math.max(n[2],Math.max(n[0], n[1]));
		int b = Math.min(n[2],Math.max(n[0], n[1]));
		System.out.printf("%d%3d%3d" ,b ,30 ,a);	
		input.close();
		
	}

}
