
import java.util.Scanner;
public class Checknum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner(System.in);
System.out.print("please enter 9 digits : ");
int []a=new int [9];
for(int i=0;i<a.length;i++){
	a[i]=input.nextInt();
	
}
 int checksum=(a[0]*1+a[1]*2+a[2]*3+a[3]*4+a[4]*5+a[5]*6+a[6]*7+a[7]*8+a[8]*9)%11;
 if (checksum==10)
	 System.out.println("The ISBN is : " +a[0]+""+a[1]+""+a[2]+""+a[3]+""+a[4]+""+a[5]+""+a[6]+""+a[7]+""+a[8]+""+"X");
 else
System.out.print("The checksum is "+checksum);
System.out.print("The ISBN is : " +a[0]+""+a[1]+""+a[2]+""+a[3]+""+a[4]+""+a[5]+""+a[6]+""+a[7]+""+a[8]+""+checksum);


}

}
