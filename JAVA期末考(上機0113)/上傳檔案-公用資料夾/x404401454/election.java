import java.util.Scanner;


public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("���إ���j��A�п�J�A����");
        System.out.println("����ܥثe�z�٦�10�i�ﲼ");
        System.out.println("(�@)�B������");
        System.out.println("(�G)�B�����^");
        System.out.println("(�T)�B������");
        System.out.println("(�|)�B�o��");
        int a = 0,b=0,c=0,d=0 ;
        for(int i=10 ; i>=1 ; i--){
        	int ticket = input.nextInt();
        	if(ticket==1)
        		a++;
        	if(ticket==2)
        		b++;
        	if(ticket==3)
        		c++;
        	if(ticket==4)
        		d++;
        	if(ticket<1||ticket>4)
        		d++;        		
        	System.out.println("�A�٦�"+(i-1)+"�i��");
        }
        System.out.println("�j�ﵲ�G�έp:");
        System.out.println("(�@)�B������   "+a+"�i��");
        System.out.println("(�@)�B�����^   "+b+"�i��");
        System.out.println("(�@)�B������   "+c+"�i��");
        System.out.println("(�@)�B�o��   "+d+"�i��");
	}
	

}
