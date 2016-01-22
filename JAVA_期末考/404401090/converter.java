
import java.util.Scanner;
public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter 10 numbers (kilogram):");
		int kg[]=new int[10];
		double pound[]=new double[10];
		for(int num=0;num<10;num++){
		 kg[num]=input.nextInt();
		}
		for(int num1=0;num1<10;num1++){
			 pound[num1] =(kg[num1]*2.20462);
		}
		
		System.out.print("  kg           pound\n");
		for(int num2=0;num2<10;num2++){
		System.out.printf("%3d          %5.2f\n",kg[num2],pound[num2]);
		
		}
	}

}
