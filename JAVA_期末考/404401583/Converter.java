import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     System.out.println("��J�����:");
     Double kg = input.nextDouble();
     
     System.out.println("Kilogram:"+kg);
     System.out.println("Pound:"+kg*2.20462);
	}

}
