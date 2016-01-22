
import java.util.Scanner;
public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Kilogram: ");
        Scanner input =  new Scanner (System.in);
        double k = input.nextDouble();
        double p;
       
        p = 2.20462 * k;
       
        System.out.printf("Pound: %5.2f",p);
    

	}

}
