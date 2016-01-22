import java.util.Scanner;


public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int kg = input.nextInt(); 
		double pound =	kg *2.20462;
		System.out.printf("Kilodram :" + kg);
		System.out.println("");
		System.out.printf("Pound : %.2f    " , pound);
	}
	

}
