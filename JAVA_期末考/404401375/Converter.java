import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("Kilogram : ");
float Kilogram = input.nextInt();
float Pound = (float) (Kilogram * 2.20462);

System.out.printf("Pound : "+"%1.2f",Pound);
	}

}
