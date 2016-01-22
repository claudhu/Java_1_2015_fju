import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the three numbers ");
		int a =input.nextInt();
		int b =input.nextInt();
		int c =input.nextInt();
		if(a<b&&a<c){
			System.out.printf("%d",a);
			if(b<c){
				System.out.printf("%4d",b);
				System.out.printf("%4d",c);
			}
			else{
				System.out.printf("%4d",c);
				System.out.printf("%4d",b);
			}
		}
		else if(b<a&&b<c){
			System.out.printf("%d",b);
			if(a<c){
				System.out.printf("%4d",a);
				System.out.printf("%4d",c);
			}
			else{
				System.out.printf("%4d",c);
				System.out.printf("%4d",a);
			}
		}
		if(c<b&&c<a){
			System.out.printf("%d",c);
			if(a<b){
				System.out.printf("%4d",a);
				System.out.printf("%4d",b);
			}
			else{
				System.out.printf("%4d",b);
				System.out.printf("%4d",a);
			}
		}

	}

}
