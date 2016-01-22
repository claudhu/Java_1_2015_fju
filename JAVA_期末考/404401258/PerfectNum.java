

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("The perfect numbers that are less than 10000 are:");
		
		for(int number=6 ; number<=10000 ; number++){
			int total = 0;
			for(int divisor=1 ; divisor<=number/2 ; divisor++){
					if(number%divisor == 0)
						total += divisor;
			}
				
			if(total == number)
					System.out.println(number);
				
					
		}
		

	}

}
