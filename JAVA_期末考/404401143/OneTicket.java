import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int [] a={1,2,3,4,5};
		System.out.println("�п�J�����N�X(1)VIP(2)�]�[(3)�e����(4)���k��(5)�̰��Ϯy��:");	
		int n=input.nextInt();
		System.out.println("�п�J�ƶq:");	
		int num =input.nextInt();
		int sum=0;
		if(a[0]==n){
			sum+=3000*num;
		}
		if(a[1]==n){
			sum+=2500*num;
		}
		if(a[2]==n){
			sum+=2000*num;
		}
		if(a[3]==n){
			sum+=1000*num;
		}
		if(a[4]==n){
			sum+=500*num;
		}
		
		System.out.println("�`���B: "+sum);	
	}

}
