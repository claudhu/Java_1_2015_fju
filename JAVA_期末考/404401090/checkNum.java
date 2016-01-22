
import java.util.Scanner;
public class checkNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter 9 digits");
		long num =input.nextLong();
		long num1=num;
		int a[]=new int[9];
		for(int i=0;i<9;i++){
			a[i]=(int) (num%10);
			num/=10;
		}
		int checksum=(a[0]*9+a[1]*8+a[2]*7+a[3]*6+a[4]*5+a[5]*4+a[6]*3+a[7]*2+a[8]*1)%11;
		num1*=10;
		long ISBN =num1+checksum;
		int b[]=new int [9];
		if(checksum!=10){
		for(int c=0;c<10;c++){
			b[c]=a[c];
		}
		b[10]=checksum;
		}
		
		System.out.print("The checksum is "+checksum);
		System.out.print("\nThe ISBN is \n");
		for(int n=0;n<10;n++){
			System.out.print(b[n]);
		}
	}

}
