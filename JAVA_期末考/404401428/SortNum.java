import java.util.Scanner;


public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the three numbers : ");
		
		int array[] = new int[3];
		
		array[0] = scn.nextInt();
		array[1] = scn.nextInt();
		array[2] = scn.nextInt();
		
		
		for(int i = 0 ; i <= array.length-1 ; i++)
		{
			int curmin = array[i];
			int curindex = i;
			
			for(int k = i + 1 ; k < array.length ; k++)
			{
				if(curmin > array[k])
				{
					curmin = array[k];
					curindex = k;
				}
			}
			
			if(curindex == i)
			{
				array[curindex] = array[i];
				array[i] = curmin;
			}
			System.out.print(array[i]);
		}
	

	}

}
