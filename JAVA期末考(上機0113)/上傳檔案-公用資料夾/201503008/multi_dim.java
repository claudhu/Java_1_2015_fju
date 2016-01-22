


import java.util.Scanner;

public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a[][] = new int[4][2];
		a[0][0]=78;
		a[0][1]=100;
		a[1][0]=59;
		a[1][1]=80;
		a[2][0]=90;
		a[2][1]=70;
		a[3][0]=65;
		a[3][1]=120;
		double average1 =(a[2][0]+a[2][1])/2;
		double average2 =(a[0][0]+a[1][0]+a[2][0]+a[3][0])/4;
		double average3 = 0;
		for(int i =0;i<4;i++)
		{
			for(int j =0;j<2;j++)
			{
				average3+=a[i][j];
			}
		}
		average3=average3/8;
		System.out.printf("丙的平均分數%.2f\n",average1);
		System.out.printf("國文成績的的平均分數%.2f\n",average2);
		System.out.printf("全班的平均分數%.2f\n",average3);

	}

}
