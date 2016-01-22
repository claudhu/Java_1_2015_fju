import java.util.Scanner;
public class MoreTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("請輸入門票代碼");
		int array[]=new int[6];
	    array[1]=3000;
	    array[2]=2500;
	    array[3]=2000;
	    array[4]=1000;
	    array[5]=500;
	    int total=0;
	    while(n!=0)
	    {
	    	System.out.println("請輸入門票張數");
	    	int k=input.nextInt();
	    	total+=array[n]*k;
	    }
		System.out.println(total);
		}

}
