
import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		int checksum;
		byte[] list=new byte[9];
		int n;
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter 9 digits:");
		
		for(int i=0;i<9;i++) {
		list[i]= input.nextByte();
		}
			
		checksum = calChecksum(n);
		System.out.printf("The checksum is:%s%d",list,checksum);	
		//System.out.printf("The ISBN is: %d\n",);
		
	}
	
	public static int calChecksum(byte[] list){
		for(int i=0;i<9;i++)
			list[i]
	}
}
