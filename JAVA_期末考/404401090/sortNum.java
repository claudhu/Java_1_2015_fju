
import java.util.Scanner;
public class sortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter the three numbers\n");
		int num[]=new int[3];
		for(int a=0;a<3;a++){
			num[a]=input.nextInt();			
		}
        java.util.Arrays.sort(num);
        System.out.print("The sorting result is as follows: \n");
        for(int b=0;b<3;b++){
        	System.out.print(num[b]+" ");
        }
	}

}
