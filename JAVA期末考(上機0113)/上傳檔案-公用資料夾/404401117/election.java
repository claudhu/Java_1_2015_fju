
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 10 ;
		int a = 0 ;
		int b = 0 ;
		int c = 0 ;
		int d = 0 ;
		while(true){
		System.out.println("���إ����`�Τj��,�п�J�A���벼���,�ثe�A�٦�"+number+"�i�����"
				+ "(�@)������(�G)�����^(�T)������(�|)�o��");
		
		int i = input.nextInt();
		switch(i){
		case(1):{ a++ ; number-- ;} break ;
		case(2):{ b++ ; number-- ;} break ;
		case(3):{ c++ ; number-- ;} break ;
		case(4):{ d++ ; number-- ;} break ;
		}
		if(number == 0 )
			break ;
		
		}
		System.out.println("�j�ﵲ�G�έp: (�@)������"+ a +"��"
				+"(�G)�����^" + b + "��"+
				"(�T)������  " + c +"��"+
				"(�|)�o��" + d + "��");
	}
}
