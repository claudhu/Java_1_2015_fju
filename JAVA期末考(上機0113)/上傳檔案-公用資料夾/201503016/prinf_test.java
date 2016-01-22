
import java.util.Scanner;
public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    int a[] = new int[8];
    for(int i=0;i<8;i++)
    {
    	a[i]=input.nextInt();
    }
    for(int i=0;i<8;i++)
    {
    	if(i%4==0 &&i!=0)
    	{System.out.println();
    	}
    	System.out.printf("%10d",a[i]);
    }
	}

}
