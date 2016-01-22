
import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the three numbers : ");
		int array[]=new int [3];
		array[0] = input.nextInt();
		array[1] = input.nextInt();
		array[2] = input.nextInt();
		System.out.println(array[0]+" "+array[1]+" "+array[2]);
		System.out.println("The sorting result is as follows : "  );
		SS(array);
		
	}
	public static void SS(int list[]){
		
		for(int i=0;i<=list.length-1;i++){
			int min = list[i];
			int location = i;
			for(int j=i+1;j<list.length;j++ ){
				if(min>list[j])
					min = list[j];
					location = j;		
			}
			
			if(location!=i){
				
				list[location] = list[i];
				list[i] = min;
				
			}
				
		}
	}
	
}