
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("�`�Χ벼.�A���Q�i��");
		System.out.print("1.������");
		System.out.print("2.�����^");
		System.out.print("3.������");
		System.out.print("4.�o��");
		int one =0;
		int two=0;
		int three =0;
		int four=0; 
		
		int num[]=new int [10];
		for(int a=0;a<10;a++){
			num[a]=input.nextInt();
			if(num[a]==1){
				one++;
			}
			else if(num[a]==2){
				two++;
			}
			else if(num[a]==3){
				three++;
			}
			else
				four++;
			System.out.print("�ٳ�"+(9-a)+"�i��");
		}
        System.out.println("���G�έp");
        System.out.println("1��������"+one+"��");
        System.out.println("2�������^"+two+"��");
        System.out.println("3��������"+three+"��");
        System.out.println("�o��"+four+"��");
	}

}
