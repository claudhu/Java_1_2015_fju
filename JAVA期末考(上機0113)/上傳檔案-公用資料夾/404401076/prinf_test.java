
import java.util.Scanner;
public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input=new Scanner(System.in);
	System.out.println("請輸入8個整數");
	int array[]=new int[8];
	for(int i=0;i<8;i++)
	{
		array[i]=input.nextInt();
	}
	int count=0;
	for(int j=0;j<8;j++)
	{
		
		System.out.printf("%7d",array[j]);
	    count++;
	    if(count==4)
	    	System.out.println();
	    
	}
	}

}
