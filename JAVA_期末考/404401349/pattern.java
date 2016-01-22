import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("please enter a numbers:");                                                                                                                                                                                                                               
		int n=input.nextInt();
		System.out.println("your aquare looks like:");
		for (int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
				}
			for(int k=n-1;k>=i;k--){
				System.out.print("# ");	
			}
			System.out.println();
			}
		System.out.print("please enter a numbers:");                                                                                                                                                                                                                               
		int n1=input.nextInt();
		System.out.println("your aquare looks like:");
		for (int i1=1;i1<=n1;i1++){
			for(int j1=1;j1<=i1;j1++){
				System.out.print("* ");
				}
			for(int k1=n1-1;k1>=i1;k1--){
				System.out.print("# ");	
			}
			System.out.println();
			}		
	}

}
