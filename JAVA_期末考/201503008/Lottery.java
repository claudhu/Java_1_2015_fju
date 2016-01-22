
import java.util.Scanner;


public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter the number:");
		int award = 0;
		int num = input.nextInt();
     	int number = (int) (Math.random()*1000);
		//int number = 132;                                             // You can change this number to do the test
		while(number<100)                                               //To make sure the number is more than 100
		{
			number = (int) (Math.random()*1000);
		}
		System.out.printf("The random number is:%5d\n",number);
		
		if(number == num)
		{
			award = 10000;
			System.out.printf("You win the first prize, money award is :%d \n", award);
		}
		else if((number - num)%100 ==0)
		{
			award = 6000;
			System.out.printf("You win the third prize, money award is :%d \n", award);
		}
		else
		{
		  int array1[]= new int[3];
		  int array2[]= new int[3];
		  for(int i =0; i<3;i++)
		  {
			array1[i] = number%10;
			array2[i] = num%10;
			number = number/10;
			num = num/10;
		  }

	    	int temp = 0;
			for(int i =0; i<3 ; i++)
			{
				temp =i;
				for(int j = i; j<2;j++)
				if(array1[temp]>array1[j+1])
				{
					temp = j+1;

				}
				int a =array1[i];
				array1[i] = array1[temp];
				array1[temp] = a;
			}
			for(int i =0; i<3 ; i++)
			{
				temp =i;
				for(int j = i; j<2;j++)
				if(array2[temp]>array2[j+1])
				{
					temp = j+1;

				}
				int a =array2[i];
				array2[i] = array2[temp];
				array2[temp] = a;
			}

		if(array1[0]==array2[0]&&array1[1]==array2[1]&&array1[2]==array2[2])
		{
			award = 8000;
			System.out.printf("You win the second prize, money award is :%d \n", award);
		}
			

		else
		{
			System.out.printf("You win no prize \n");
		}
		
		}
		
		
		

	}

}
