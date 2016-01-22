
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in) ;
System.out.println("請輸入重量");
double num = input.nextDouble() ;
double pound = num*2.20462;
System.out.println("kilogram:"+num);
System.out.printf("Pound:%f",pound ) ;
	}

}
