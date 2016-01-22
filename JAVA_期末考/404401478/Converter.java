

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner input = new Scanner(System.in);
          System.out.println("請輸入一個重量(公斤)");
          
          double k1 = input.nextDouble();
          double p  = 2.20462;
          System.out.printf("%.2f",k1*p);
          
	}

}
