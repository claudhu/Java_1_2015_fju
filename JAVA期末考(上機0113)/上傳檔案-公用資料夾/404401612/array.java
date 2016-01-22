import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        int num[ ] = { 20 , 8 , 7 , 50 , 30 , 90 , 78 , 15 , 
        		12 , 100 , 7 } ;
        
        
        // Linear Search
        System.out.println("Linear Search");
        int count = 0 ;
        for ( int i = 0 ; i < num.length ; i ++){
        	count++;
        	if ( num[i] == 78 ){
        		System.out.println(" 需要 :" + count + " 次 ");
        		break;
        	}
        }
        
        System.out.println("-------------------------------");
        
        //Selection Sort
        System.out.println("Selection sort");
        for ( int a = 0 ; a < num.length-1 ; a ++ ){
        	int min = num[a];
        	int minIndex = a ;
        	for ( int b = a + 1 ; b < num.length ; b ++){
        		if ( min > num[b]){
        			min = num[b];
        			minIndex = b ;
        		}
        	}
        	if ( minIndex != a){
        		num[minIndex] = num[a];
        		num[a] = min;
        	}
        }
        for ( int i = 0 ; i < num.length ; i ++ ){
        	System.out.print( num[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------");
        //Binary Search
        System.out.println("Binary Seach");
        int low = 0 ;
        int high = num.length -1 ;
        
        int count2 = 0 ;
        for ( int i = 0 ; i < num.length -1 ; i ++){
        	count2 ++ ;
        	int mid = ( low + high ) / 2 ;
        	if ( num[ mid ] < 78 )
        		low = mid + 1 ;
        	else if ( num[mid] == 78)
        		break;
        	else if ( num[mid] > 78)
        		high = mid - 1 ;
        }
        System.out.println("總共花 "+ count2 + " 次 ");
	}

}
