
import java.util.Scanner;
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int a[][]=new int [4][2];
a[0][0]=78;
a[0][1]=100;
a[1][0]=59;
a[1][1]=80;
a[2][0]=90;
a[2][1]=70;
a[3][0]=65;
a[3][1]=120;
double b=(a[3][0]+a[3][1])/2;
double guowen=(a[0][0]+a[1][0]+a[2][0]+a[3][0])/4;
double all=(a[0][0]+a[0][1]+a[1][0]+a[1][1]+a[2][0]+a[2][1]+a[3][0]+a[3][1])/8;
System.out.println("the average of bing is "+b);
System.out.println("the average of guowen is "+guowen);
System.out.println("the average of quanban is "+all);
}

}
