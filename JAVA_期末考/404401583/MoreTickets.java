import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    int a,b;
    int sum=0;
    for(int i=0 ; i<=5;i++){
    System.out.println("��J�����N�X(1~5):");
     a = input.nextInt();
    
    System.out.println("��J�һݱi��:");
     b = input.nextInt();
    
    if (a==1){  a=3000;   }
   else if (a==2){  a=2500;  }
   else if (a==3){ 	a=2000;  }
   else if (a==4){	a=1000;  }
   else if (a==5){ 	a=500;  }
   else if (a==0){
   break;}
      sum=a*b;
	}
    sum++;
	System.out.println("�`�@"+sum+"��");
	}
}
