
import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�����N�X��J0�ɱN���z�p���`���B");
		System.out.println("�п�J�����N�X");
		int a = input.nextInt();
		System.out.println("�п�J�Ӻت����ƶq");
		int b = input.nextInt();
		
		
		while(a!=0){
			System.out.println("���~���J�����N�X");
			a = input.nextInt();
			System.out.println("���~���J�Ӻت����ƶq");
			b = input.nextInt();
		}
		

		if(a==1){
			System.out.println("�����`���B��:"+b*3000);
		}
		else if(a==2){
			System.out.println("�����`���B��:"+b*2500);
		}
		else if(a==3){
			System.out.println("�����`���B��:"+b*2000);
		}
		else if(a==4){
			System.out.println("�����`���B��:"+b*1000);
		}
		else{
			System.out.println("�����`���B��:"+b*500);
		}
		
	}

}
