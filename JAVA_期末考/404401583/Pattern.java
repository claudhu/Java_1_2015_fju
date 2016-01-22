import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     System.out.println("輸入一個數");
     int number = input.nextInt();
		for(int i=0;i<number;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
				
				
			}
			for(int s=1;s<number-i;s++){
				System.out.print("#");}
			System.out.println();
		}
	}

}
