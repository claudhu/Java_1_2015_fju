import java.util.Scanner;
public class SortNum {

	public static void main(String args[]){
		
		System.out.print("please enter the three numbers: : ");
		System.out.println();
		Scanner input = new Scanner(System.in);
		
		int point[] = new int [3];
		for(int i=0; i<point.length; i++){
			point[i] = input.nextInt();
			
		}
		
		sort(point);
	}
	
	
	public static void sort(int point[]){
		System.out.println("the sorting result is as follow: ");
		for(int i=0; i<point.length; i++){
			int currentmin =point[i];
			int currentindex =i;
			
			for(int j=i+1; j<point.length; j++){
				if(currentmin>point[j]){
					currentmin = point[j];
					currentindex = j;
				}
			}
			
			if(currentindex != i){
				point[currentindex] = point[i];
				point[i] = currentmin;
			}
				
			System.out.print(point[i]+" ");
		}
	
	}
	
	
}
