

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Please enter 9 digits : ");
		String number = input.nextLine();
		int is = Integer.parseInt(number);
		int total =0;
		for(int i=9 ; i>=1 ; i--){
			int d = is%10;
			total = total+d*i;
			is = is/10;
		}
		
		int end = total%11;
		if(end==10){
		    System.out.println("The checksum is: X");
		    System.out.println("The ISBN is: "+number+"X");
		}
		else{
			System.out.println("The checksum is: "+end);
		    System.out.println("The ISBN is: "+number+end);
		}

	}

}
