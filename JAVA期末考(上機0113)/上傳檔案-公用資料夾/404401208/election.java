import java.util.Scanner;


public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    int num1 = 0 ,num2 = 0 ,num3=0,num4 = 0,count = 0;
    for(int i = 10 ; i > 0 ;i -- ){
    	System.out.println("������`�Τj��A�п�J�A���벼��ܡA�z�ثe�٦�"+i+"�i�ﲼ");
    	System.out.println("(�@)�B������ ");
    	System.out.println("(�G)�B�����^ ");
    	System.out.println("(�T)�B������ ");
    	System.out.println("(�|)�B�o�� ");
    	int ticket = input.nextInt();
    	switch(ticket){
    	case 1 : num1 ++;break;
    	case 2 : num2 ++;break;
    	case 3 : num3 ++;break;
    	default : num4 ++;
      	}
    }
    System.out.println("�j�ﵲ�G�έp : ");
    System.out.println("(�@)�B������ "+num1+"��");
	System.out.println("(�G)�B�����^ "+num2+"��");
	System.out.println("(�T)�B������ "+num3+"��");
	System.out.println("(�|)�B�o�� "+num4+"�� ");
	}
 
}
