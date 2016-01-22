import java.util.Scanner;


public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the three number :");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
				
		
		for(int i = 0 ; i<3 ; i++){
				if(a>b && a>c && b>c){
					System.out.printf("%d %d %d" ,c , b ,a );
				
				}
				else if (a>b && a>c && c>b){
					System.out.printf("The sorting result is as follows%d %d %d" ,b, c , a );
				}
				else if (b>a && b>c && a>c){
					System.out.printf("The sorting result is as follows%d %d %d" ,c , a , b );
				}
				else if (b>a && b>c && c>a){
					System.out.printf("The sorting result is as follows%d %d %d" ,a , c , b );
				}
				else if (c>a && c>b && a>b){
					System.out.printf("The sorting result is as follows %d %d %d" ,b , a , c );
				}
				else if (c>a && c>b && b>a){
					System.out.printf("The sorting result is as follows %d %d %d" ,a , b , c );
				}
				break;
					
	}
		
	}

}
