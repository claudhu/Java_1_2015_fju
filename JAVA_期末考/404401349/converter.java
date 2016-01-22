import java.util.Scanner;
public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("enter a kilomgram");
		int kilogram =input.nextInt();
		double pound;
		pound= 2.20462*kilogram;
		System.out.printf("kilogram:%d\n",kilogram);
		System.out.printf("pound:%.2f",pound);
		input.close();
	}

}
