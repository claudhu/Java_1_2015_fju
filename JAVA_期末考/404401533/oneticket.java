import java.util.Scanner;


public class oneticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("�����N�X\t�����W��\t����");
		System.out.println("1\tVip\t3000");
		System.out.println("2\t�]�[\t2500");
		System.out.println("3\t�e����\t2000");
		System.out.println("4\t���k��\t1000");
		System.out.println("5\t�̰��Ϯy��\t500");
		System.out.println("�п�ܤ@�ت����N�X");
		int num = input.nextInt();
		System.out.println("�п�ܱi��");
		int i = input.nextInt();
		int totalprice;
		if(num==1){
			totalprice=3000*i;
			System.out.println("�`���B��"+totalprice);
			}
		else if(num==2){
			 totalprice=2500*i;
			System.out.println("�`���B��"+totalprice);
		}
		else if(num==3){
			 totalprice=2000*i;
			System.out.println("�`���B��"+totalprice);
		}
		else if(num==4){
			 totalprice=1000*i;
			System.out.println("�`���B��"+totalprice);
		}
		else if(num==5){
			 totalprice=500*i;
			System.out.println("�`���B��"+totalprice);
		}
		
		
	}

}
