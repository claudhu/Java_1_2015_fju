

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Kilogram:");
        int k=input.nextInt();
        double p=k*2.20462;
        System.out.printf("Pound:%5.2f",p);
        input.close();
	}

}
