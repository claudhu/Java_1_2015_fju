import java.util.Scanner;
public class electiion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
int number = 10;
int a = 0;
int b = 0;
int c = 0;
int d = 0;

while(true){
	System.out.println("������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�"+number+"�i(�@)�B������(�G)�B�����^(�T)�B������ (�|)�B�o��");
	int i=input.nextInt();
	switch(i){
	case (1):{a++;number--;break;}
	case (2):{b++;number--;break;}
	case (3):{c++;number--;break;}
	case (4):{d++;number--;break;}		
	}
	if(number==0){
		break;	}
}
System.out.println("�j�ﵲ�G�έp�G �j�ﵲ�G�έp�G(�@)�B������  "+a+"��(�G)�B�����^  "+b+"��(�T)�B������  "+c+" ��(�T)�B�o��  "+d+"��");
	}

}
