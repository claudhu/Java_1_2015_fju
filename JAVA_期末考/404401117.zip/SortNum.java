
import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter ther three number");
		int[] myList = new int[3];
		for(int i = 0 ; i < myList.length ; i++ ){
			myList[i] = input.nextInt();
		}
		System.out.println("The sorting result is as follows ; ");
		for(int i = 0 ; i < myList.length ; i++){
			int currentmin  = myList[i];
			int currentminindex = i ;
			
			for(int j = i+1 ; j < myList.length ; j++){
				if(currentmin > myList[j]){
					currentmin = myList[j];
					currentminindex  = j;
				}
			}
			
			 if(currentminindex != i){
				 myList[currentminindex] = myList[i];
				 myList[i] = currentmin;
			 }
			 System.out.printf("%-3d" , currentmin);
		}
	}

}
