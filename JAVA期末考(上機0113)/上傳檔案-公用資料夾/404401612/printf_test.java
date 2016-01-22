import java.util.Scanner ;
public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter: ");
        
        int num[ ] = new int [ 8 ];
        for (int i = 0 ; i < num.length ; i ++ ){
        	num[i] = input.nextInt();
        }
        
        for ( int j = 0 ; j < num.length ; j ++){
        	System.out.printf("%10d",num[j]);
        	if ( j == 3)
        		System.out.println();
        }
	}

}
