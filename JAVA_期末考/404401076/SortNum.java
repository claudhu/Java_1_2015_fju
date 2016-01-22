import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter three number:");
		Scanner input=new Scanner(System.in);
		int array[]=new int[3];
		for(int i=0;i<3;i++)
		array[i]=input.nextInt();
		java.util.Arrays.sort(array);
		System.out.println("The sorting result is as follow:");
		for(int j=0;j<3;j++)
		System.out.print(array[j]+" ");
	}

}
