import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("��J�����N�X(1~5):");
    int a = input.nextInt();
    System.out.println("��J�һݱi��:");
    int b = input.nextInt();
    if (a==1){
         a=3000;
    }
    else if (a==2){
    	a=2500;
    }
    else if (a==3){
    	a=2000;
    }
    else if (a==4){
    	a=1000;
    }
    else {
    	a=500;
    }
    
    
    System.out.println("�`�@"+a*b+"��");
    
	}

}
