import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("enter your kilogram");
        double Kilogram = input.nextDouble();
        double Pound = Kilogram*2.20462;
        System.out.println("Kilogram:"+Kilogram);
        System.out.print("Pound:");System.out.printf("%5.2f",Pound);
	}

}
