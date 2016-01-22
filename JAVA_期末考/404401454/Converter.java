import java.util.Scanner;


public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.printf("Kilogram:");
        float KG = input.nextFloat();
        double W = 2.20462*KG ;
        System.out.println("Pound :"+ W) ;
	}

}
