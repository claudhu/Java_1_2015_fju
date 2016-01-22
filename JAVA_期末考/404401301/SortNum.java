import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the three numbers :");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int number[]={a,b,c};
		System.out.println("The sorting result is as follows: ");
		selectionsort(number);
		
	}
	
	
	public static void selectionsort(int number[]){
		for(int i = 0 ; i<number.length ; i++){
		int currentmin = number[i];
		int currentindexofmin= i;
		
		
		for(int j = i+1; j<number.length ; j++){
		if(currentmin>number[j]){
			currentmin=number[j];
			currentindexofmin=j;
		}
		
		if(currentindexofmin != i){
			number[currentindexofmin]=number[i];
			number[i]=currentmin;
		}
			
		
		}
		
		System.out.print("\t "+number[i]);
		
		}
	
	}
}
