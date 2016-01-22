import java.util.Scanner;


public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    int count = 0;
    int array[] =new int[8];
    for(int i = 0 ; i < array.length;i++){
    	array[i] = input.nextInt();
    	System.out.printf("%14d",array[i]);
    	count++;
    	if(count%4==0)
    		System.out.println("");
    }
	}

}
