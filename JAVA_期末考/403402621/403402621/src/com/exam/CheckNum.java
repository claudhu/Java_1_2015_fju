
import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter 9 digits:");
		int enter=input.nextInt();
		int[] d=new int[9];
		for(int i=8;i>=0;i--){
			d[i]=enter%10;
			enter=enter/10;
		}
		int x=(d[0]*1+d[1]*2+d[2]*3+d[3]*4+d[4]*5+d[5]*6+d[6]*7+d[7]*8+d[8]*9)%11;
		if(x==10){
			x='X';
		}
		System.out.println("The checksum is:"+x);
		System.out.print("The ISBN is:"+d[0]+d[1]+d[2]+d[3]+d[4]+d[5]+d[6]+d[7]+d[8]+x);

	}

}
