import java.util.Scanner;


public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input= new Scanner (System.in);
    System.out.println("������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�10�i�ﲼ");
    System.out.println("(�@)������");
    System.out.println("(�G)�����^");
    System.out.println("(�T)������");
    System.out.println("(�|)�o��");
    int a = 0 ; int b = 0 ;int c = 0;int d =0;
    for(int i = 9; i>=0 ; i--){
    	int ticket = input.nextInt();
     if(ticket==1){
    	 System.out.printf("������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�%d�i�ﲼ",i);
    	 a++;}
     else if (ticket==2){
        	 System.out.printf("������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�%d�i�ﲼ",i);
        	 b++;}
     else if(ticket==3){
    	 System.out.printf("������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�%d�i�ﲼ",i);
    	 c++;}
    else if(ticket==4){
        	 System.out.printf("������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�%d�i�ﲼ",i);
        	 d++;}
     }
    System.out.println("\n�j�ﵲ�G�έp�G");
    System.out.printf("(�@)�B������ �B������%d��\n",a);
    System.out.printf("(�G)�B�����^ �B�����^%d��\n",b);
    System.out.printf("(�T)�B������ �B������%d��\n",c);
    System.out.printf("(�|)�B�o�� �B�o�� %d��\n",d);

    }

	}


