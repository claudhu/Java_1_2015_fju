
import java.util.Scanner;


public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter the three numbers:\n");
		int num[] = new int[3];
		num[0] = input.nextInt();
		num[1] = input.nextInt();
		num[2] = input.nextInt();
		int temp = 0;
		for(int i =0; i<3 ; i++)
		{
			temp =i;
			for(int j = i; j<2;j++)
			if(num[temp]>num[j+1])
			{
				temp = j+1;

			}
			int a =num[i];
			num[i] = num[temp];
			num[temp] = a;
		}
		System.out.printf("The sorting result is as follows:\n");
		
		for(int i =0;i<3;i++)
		{
			System.out.printf("%d ",num[i]);
		}
		

	}

}
