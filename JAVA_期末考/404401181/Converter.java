import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("請輸入重量(磅)");

Scanner input = new Scanner(System.in);

double kg = input.nextDouble();

float pound;

System.out.println("你輸入的重量是"+kg*2.20462+"pound"); 

	}

}
