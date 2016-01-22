
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int list[] = {20,8,7,50,30,90,78,15,12,100,7} ;
		
		//Linear Search
		int key = 78 ;
		for(int i=0; i<list.length; i++) {
			int j = i+1 ;
			if( list[i] == key) {
				System.out.println("1.It has been " + j + " times to find number 78." ) ;
			}
		}
		
		//Selection Sort
		System.out.print("2.This array can be disaplayed as: {" ) ;
		int min = list[0] ;
		int indexOfMin = 0 ;
		int tem=0 ;
		
		for(int j=0; j<list.length; j++) {
			min = list[j] ;
			indexOfMin = j ;
			
			for(int k=j+1; k<list.length; k++) {
				if (list[k] < min) {
					min = list[k] ;
					indexOfMin = k ;
				}
			}
			
			tem = list[j] ;
			list[j] = min ;
			list[indexOfMin] = tem ;
			
			System.out.printf("%d,",list[j]) ;
		}
		System.out.println("}") ;
		
		
		//Binary Search
		
		int low, high, mid ;
        low = 0 ;
		high = 10 ;
		for(int m=1; m<=list.length; m++) {

			mid = (high + low) /2 ;
			
			if ( list[mid]<key) {
				low = mid + 1 ; 
			}
			else if (list[mid] == key) {
				System.out.println("It has been " + m + " times to find number 78.") ;
				break;
			}
			else
				high = mid - 1 ;

		}
		
		
		

		
		
	}

}
