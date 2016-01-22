import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("½Ð¿é¤J¤½¤ç:");
		Scanner input=new Scanner(System.in);
		double kg=input.nextDouble();
		double pound=0;
		pound=kg*2.20462;
		System.out.printf("%6s %4.2f","pound:",pound);
	}

}
