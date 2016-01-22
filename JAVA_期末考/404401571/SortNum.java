
import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入三個整數");
		int a = input.nextInt(); 
		int b = input.nextInt(); 
		int c = input.nextInt(); 
		
		System.out.println("Please enter the three numbers: ");
		System.out.println(a+"  "+b+"  "+c);
		
		Sorting(a,b,c);
	}
	
	public static void Sorting(int a,int b,int c){
		if(a>b&&b>c){
			System.out.println("The sorting result is as follows");
			System.out.println(a+"  "+b+"  "+c);
		}
		else if(a>b&&c>b){
			System.out.println("The sorting result is as follows");
			System.out.println(a+"  "+c+"  "+b);
		}
		else if(b>c&&c>a){
			System.out.println("The sorting result is as follows");
			System.out.println(b+"  "+c+"  "+a);
		}
		else if(b>a&&a>c){
			System.out.println("The sorting result is as follows");
			System.out.println(a+"  "+b+"  "+c);
		}
		else if(c>a&&a>b){
			System.out.println("The sorting result is as follows");
			System.out.println(c+"  "+a+"  "+b);
		}
		
		else if(c>b&&b>a){
			System.out.println("The sorting result is as follows");
			System.out.println(c+"  "+b+"  "+a);
		}

		
	}

}
