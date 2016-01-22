
public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int number[][] = new int[2][4];
		
		for(int i=0 ; i<number.length ;i++){
			for(int k=0 ; k<number[i].length ; k++){
				number[i][k] = input.nextInt();
			}
		}
		
		for(int i=0 ; i<number.length ; i++){
			for(int k=0 ; k<number[i].length ; k++){
				System.out.printf("%6d   ",number[i][k]);
			}
			System.out.println("");
		}
		

	}

}
