import java.util.Scanner;


public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("�п�J�A�n�ʶR�������N�X");
		int code=input.nextInt();
		System.out.println("�п�J�z�n�ʶR�������ƶq");
		int q=input.nextInt();
		if(code==1){
			int p1=3000*q;
			System.out.println("�`���欰:"+p1+"��");
			}
		else if(code==2){
			int p2=2500*q;
			System.out.println("�`���欰:"+p2+"��");
			}
		else if(code==3){
			int p3=2000*q;
			System.out.println("�`���欰:"+p3+"��");
			}
		else if(code==4){
			int p4=1000*q;
			System.out.println("�`���欰:"+p4+"��");
			}
		else if(code==5){
			int p5=500*q;
			System.out.println("�`���欰:"+p5+"��");
			}
		else
			System.out.println("�z��J����T���~");
				

	}

}
