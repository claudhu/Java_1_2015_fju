
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    System.out.println("���إ����`�Τj��A�п�J�A���벼��ܡA�ثe�A�٦�10�i�ﲼ");
	    System.out.printf("(�@)�B������\n(�G)�B�����^\n(�T)�B������\n(�|)�B�o��\n");
	    int count=0,count2=0,count3=0,count4=0;
	    int a;
		for(int i=0;i<10;i++)
	    switch(a=input.nextInt()){
	    case 1:count++;break;
	    case 2:count2++;break;
	    case 3:count3++;break;
	    case 4:count4++;break;
	    }
	    System.out.println("�j�ﵲ�G�έp:");
	    System.out.println("(�@)�B������"+count+"��");
	    System.out.println("(�G)�B�����^"+count2+"��");
	    System.out.println("(�T)�B������"+count3+"��");
	    System.out.println("(�|)�B�o��"+count4+"��");
	}

}
