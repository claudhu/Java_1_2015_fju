
import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[] = new int[3];
		
		System.out.println("Please enter the three numbers¡G");
		//¿é¤J¤T¦¸
		Scanner input = new Scanner(System.in);
		int i =0;
		
		for( i =0;i<3;i++){
	       list[i] = input.nextInt();
		 }
		
		//sort
		
		
		for( i = 0; i<list.length;i++){
			
			int currentmin = list[i];
			int currentminindex = i;
			
			for(int k = 0; k<list.length;k++){
				if(currentmin > list[k]){
					currentmin = list[k];
					currentminindex = k;
				}	
			}
			if(currentminindex != i)
			currentminindex = i;
			currentmin = list[i];
		System.out.printf("The sorting result is as follows¡G\n%f  "+list);	
		}
		
		
		

	}

}
