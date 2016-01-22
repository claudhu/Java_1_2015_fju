
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int p1=0;
int p2=0;
int p3=0;
int p4=0;
for(int i=10;i>=0;i--){
	System.out.println("the Selection,you hava"+i+" choices");
	System.out.println("1 cai");
	System.out.println("2 zhu");
	System.out.println("3 song");
	System.out.println("4 fapiao");
	int a=input.nextInt();
	switch(a){
	case 1:p1++;break;
	case 2:p2++;break;
	case 3:p3++;break;
	case 4:p4++;break;
	default: break;
	}
	
}
System.out.println("The results are : ");
System.out.println("1 cai has "+ p1);
System.out.println("2 zhu has "+ p2);
System.out.println("3 song has "+ p3);
System.out.println("4 fapiao has "+ p4);
	}

}
