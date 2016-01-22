import java.util.Scanner;


public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 9 digits");
		int n=input.nextInt();
		int c[]=new int[9];
		int b[]=new int[9];
		for(int i=0;i<=c.length-1;i++){
			c[i]=(int) (n%Math.pow(10,(9-i)));
			b[i]=(int) ((int)c[i]/(Math.pow(10,(8-i))));
		}
		int sum=0;
		for(int j=0;j<b.length;j++){
			int k=b[j]*(j+1);
			sum+=k;
		}
		int sum2=sum%11;
		System.out.println("The checksum is: "+sum2);	
		System.out.print("The ISBN is:");
		for(int j=0;j<b.length;j++){
			System.out.print(b[j]);
		}
		System.out.print(sum2);	

	}

}
