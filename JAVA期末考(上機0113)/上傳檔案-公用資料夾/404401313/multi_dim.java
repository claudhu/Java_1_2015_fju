import java.util.Scanner;


public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�ǥͦ��Z:");
		
		int a[][]=new int[4][2];
		for(int row=0;row<4;row++){
			for(int col=0;col<2;col++)
				a[row][col]=input.nextInt();
				
		}
		System.out.println("��������:"+(a[3][1]+a[3][2])/2);
		System.out.println("��媺����:"+(a[0][1]+a[1][1]+a[2][1]+a[3][1])/2);
		
		
		

	}

}
