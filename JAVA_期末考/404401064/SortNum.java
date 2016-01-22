
import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the three numbers:");
		int [] array = new int [3];
		for(int i =0 ; i < array.length ; i++){
			array[i] = input.nextInt();
		}
		System.out.print("The sorting result is as follows:" + array[i]);
		for(int i = 0 ; i < array.length  ; i++){
			int currentmin = array[i];
			int currentminindex = i;
			
			for(int j = i+1 ; j < array.length ; j++){
				if(currentmin > array[j]);
				currentmin = array[j];
				currentminindex = j; 
			}
			
		}
		if(currentminindex !=i){
			array[currentminindex] = max
		}
		
		

	}

}
