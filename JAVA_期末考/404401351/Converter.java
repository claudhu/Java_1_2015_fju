
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("Kilogram:"+" ");
    double kilo=input.nextDouble();
    double pound=kilo*2.20462;
    System.out.printf("Pound : %2.2f",pound);
	}
}
