import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    int i = 10;
  
    System.out.println("���إ����`�Τj��A�п�J�A���벼��ܡA�ثe�A�٦� " + i + "�i�ﲼ: ");
  
   for(int j = 0; j<=10; j++){
	   
	   int a = 0;break; //������
	   int b = 1;break;//�����^
	   int c = 2;break; //������
	   int d = 3; //�o��
	   return;
	   
    int k = a+b+c+d;
	    if(k > 10){
		   System.out.print("error");
    }
    System.out.println("�j�ﵲ�G�έp: ");
    System.out.println("(�@)������" + k);
    System.out.println("(�G)�����^" + k);
    System.out.println("(�T)������" + k);
    System.out.println("(�|)�o��" + k);
	}

}
}