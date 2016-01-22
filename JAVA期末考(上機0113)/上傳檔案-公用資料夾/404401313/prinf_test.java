import java.util.Scanner;

public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入八個整數:");
		
		
		int array[] = new int[8];
		int count=0;
		for(int i=0;i<8;i++){
			array[i] = input.nextInt();
			
		    count++;
		}	
		
		System.out.print(array);
		
		if(count%4==0){
			System.out.println();
		}
	}

}
