
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入重量(公斤)");
		double a = input.nextDouble();
		
		double p = a *2.20462 ;
		
		System.out.printf("Pound=%6.2f ",p);
		

	}

}
