import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("�п�J�����N�X");
		int n=input.nextInt();
		switch(n){
		case 1:
			System.out.println("VIP,�@�i3000");break;
		case 2:
			System.out.println("�]�[,�@�i2500");break;
		case 3:
			System.out.println("�e����,�@�i2000");break;
		case 4:
			System.out.println("���k��,�@�i1000");break;
		case 5:
			System.out.println("�̰��Ϯy��,�@�i500");break;
			}
		System.out.println("�п�J�����ƶq");
		int k=input.nextInt();
	    int array[]=new int[6];
	    array[1]=3000;
	    array[2]=2500;
	    array[3]=2000;
	    array[4]=1000;
	    array[5]=500;
	    int total=array[n]*k;
	    System.out.println("�z�Ү��O�����B�O"+total);
	}

}
