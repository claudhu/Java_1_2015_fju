
import java.util.*;
public class prinf_test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[8];
		int count=0;
		for(int i=0; i<array.length; i++){
			array[i] = input.nextInt();
			System.out.printf("%10d",array[i]);
			count++;
			if(count%4==0)
				System.out.printf("\n");
		}
		

	}

}
