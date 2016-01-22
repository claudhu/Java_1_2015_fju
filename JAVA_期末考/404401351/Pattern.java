import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("Please enter a numbers:");
    int num=input.nextInt();
    System.out.println("Your square looks like:");
    for(int i=1;i<=num;i++){
    	for(int k=1;k<i+1;k++){
   		 System.out.print('*');
   	}
    	for(int j=i;j<num;j++){
    		 System.out.print('#');
    	}
    	System.out.println();
    }
	}
}
