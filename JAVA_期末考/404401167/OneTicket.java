import java.util.Scanner;


public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("�п�J�����N�X�μƶq:");
		int a=input.nextInt();
		int b=input.nextInt();
		
		if(a==1){
			int Price=b*3000;
			System.out.println("�ʶR���OVIP����"+b+"�i�@"+Price+"��");}
		else if(a==2){
			int Price=b*2500;
			System.out.println("�ʶR���O�]�[����"+b+"�i�@"+Price+"��");}
		else if(a==3){
			int Price=b*2000;
			System.out.println("�ʶR���O�e��������"+b+"�i�@"+Price+"��");}
		else if(a==4){
			int Price=b*1000;
			System.out.println("�ʶR���O���k������"+b+"�i�@"+Price+"��");}
		else{
			int Price=b*500;
			System.out.println("�ʶR���O�̰��Ϯy�����"+b+"�i�@"+Price+"��");}
		

	}

}
