
import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("¿é¤J¤E½X");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		int g = input.nextInt();
		int h = input.nextInt();
		int i = input.nextInt();
		int j = (((a*1)+(b*2)+(c*3)+(d*4)+(e*5)+(f*6)+(g*7)+(h*8)+(i*9))%11);
		System.out.println("The checksum is:"+j);
		
		if(j == 10){
			System.out.println("The ISBN is:"+a+b+c+d+e+f+g+h+i+"X");
	}
		else
			System.out.println("The ISBN is:"+a+b+c+d+e+f+g+h+i+j);
	}
}
