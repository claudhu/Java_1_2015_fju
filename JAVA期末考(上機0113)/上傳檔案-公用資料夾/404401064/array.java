
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int [] array = {20,8,7,50,30,90,78,15,12,100,7};
		
		for(int i = 0 ; i < 10 ; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		int a = linearSearch(array);
		if(linearSearch(array) > 0){
			System.out.print(a);
		}
		else
			System.out.print("no");
		

	}
	public static int linearSearch(int [] array){
		
		for(int i = 0 ; i < 10 ; i++){
		if(linearSearch(array) == 78){
			
			return i;
		}
		
	}
		return 0;
	}
}


