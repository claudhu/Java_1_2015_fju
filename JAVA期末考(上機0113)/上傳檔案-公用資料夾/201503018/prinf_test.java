
import java.util.Scanner;
public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("enter 8 numbers: ");
int a[]=new int[8];
for(int i=0;i<a.length;i++){
	a[i]=input.nextInt();
	if((i+1)%4==0)
		System.out.printf("%10d \n",a[i]);
	else
		System.out.printf("%10d",a[i]);
}
	}

}
