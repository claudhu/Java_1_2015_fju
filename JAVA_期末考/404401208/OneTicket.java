import java.util.Scanner;


public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input =new Scanner(System.in);
    System.out.println("�п�J�����N�X : ");
    int code = input.nextInt();
    System.out.println("�п�J���ʶR�������ƶq : ");
    int sum = input.nextInt();
    switch(code){
    case 1 : System.out.println("�z�ʶR���OVIP��"+sum+"�i�A�@�@�O"+sum*3000+"���C");break;
    case 2 : System.out.println("�z�ʶR���O�]�[��"+sum+"�i�A�@�@�O"+sum*2500+"���C");break;
    case 3 : System.out.println("�z�ʶR���O�e������"+sum+"�i�A�@�@�O"+sum*2000+"���C");break;
    case 4 : System.out.println("�z�ʶR���O���k����"+sum+"�i�A�@�@�O"+sum*1000+"���C");break;
    case 5 : System.out.println("�z�ʶR���O�̰��Ϯy�첼"+sum+"�i�A�@�@�O"+sum*500+"���C");
    }
	}

}
