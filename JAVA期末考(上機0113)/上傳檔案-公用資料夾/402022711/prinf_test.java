import java.util.Scanner;
public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int list[] = new int [8];
		System.out.print("請輸入八個整數:");
		for(int i = 0 ; i < list.length ; i++){
			
			list[i] = input.nextInt();
			
		}
		
		int count = 0;
		for(int i = 0 ; i < list.length ; i++){
			
			System.out.print(list[i] + "\t");
			
			if(i == 3){
				System.out.println("");
			}
			
		}
		
		
		
	}

}
