import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the three number:");
		int num [] = new int[3];
		for(int i = 0; i < num.length ;i++){
			num[i] = input.nextInt();
			
		}
		
		//±Æ§Ç//
		for(int i = 0; i < num.length ;i++){
			for(int j = 0; j+1 < num.length ;j++){
				int temp = 0;

				if(num[j] > num[j+1]){
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				
				}			
			}
		}
		
		//¦L¥X¨Ó//
		
		System.out.println("The sorting result is as follows:");
		for(int i = 0; i < num.length ;i++){
			System.out.print(num[i] + " ");
			
			
		}

		
		
		
		
		
		
		
		
	}

}
