import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("�п�J�����N�X�μƶq: ");
		int code = input.nextInt();
		int num = input.nextInt();
		
		if (code == 1){
			System.out.print("�z���ʶR�������`���B�O: " + num * 3000);
			
		}
		
		else if(code == 2){
			System.out.print("�z���ʶR�������`���B�O: " + num * 2500);			
			
		}
		
		else if(code == 3){
			System.out.print("�z���ʶR�������`���B�O: " + num * 2000);			
			
		}

		else if(code == 4){
			System.out.print("�z���ʶR�������`���B�O: " + num * 1000);			
			
		}
		
		else if(code == 5){
			System.out.print("�z���ʶR�������`���B�O: " + num * 500);			
			
		}
	}

}
