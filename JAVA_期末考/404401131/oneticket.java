

import java.util.Scanner;

public class oneticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("��J�����N�X");
		int a = input.nextInt();
		System.out.println("��J�ƶq");
		int b = input.nextInt();
		int answer =0;
		if(a==1){
			answer=3000*b;
		}
		else if(a==2){
			answer=2500*b;
		}
		else if(a==3){
			answer=2000*b;
		}
		else if(a==4){
			answer=1000*b;
		}
		else if(a==5){
			answer=500*b;
		}
		System.out.println("������ "+answer);
		

	}

}
