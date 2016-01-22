import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the three numbers:");
        
        int num [ ] = new int [ 3 ];
        for ( int i = 0 ; i < num.length ; i ++){
        	num[i] = input.nextInt();
        }
        
        for ( int a = 0 ; a < num.length-1 ; a ++){
        	int min = num[a];
        	int minIndex = a ;
        	for ( int b = a + 1 ; b < num.length ; b ++ ){
        		if ( min > num[b]){
        			min = num[b];
        			minIndex = b ;
        		}
        	}
        	if ( minIndex != a ){
        		num[minIndex] = num[a];
        		num[a] = min;
        	}
        }
        System.out.println("The sorting result is as follows: ");
        for ( int i = 0 ; i < num.length ; i++){
        	System.out.print(num[i]+" ");
        }
        
        
	}

}
