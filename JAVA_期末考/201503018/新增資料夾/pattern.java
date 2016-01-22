
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("Please enter a numbers : ");
int n=input.nextInt();
for(int i=1;i<=n;i++){
	for(int j=1;j<=n;j++){
	if(i>=j)
		System.out.printf("*");
	else
	System.out.printf("#");}
	System.out.println(" ");

}

	}

}
