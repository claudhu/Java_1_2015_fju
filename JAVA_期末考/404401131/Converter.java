

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入重量(磅)");
		int a = input.nextInt();
		double answer = a*2.204;
		System.out.print("kilogram:");
		System.out.printf("%3d\n",a);
		System.out.print("pound:");
		System.out.printf("%5.2f",answer);

	}


	}


