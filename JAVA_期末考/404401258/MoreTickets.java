

public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int number[] = new int[6];
		int x=0;
		int y=0;
		while(true){
			System.out.println("�п�J�����N�X(1~5)");
			
			x = input.nextInt();
			if(x==0)
				break;
			
			System.out.println("�п�J�����i��");
			
			y = input.nextInt();
			
		    number[x] += y;
		}
		
		long total = number[1]*3000+number[2]*2500+number[3]*2000
				+number[4]*1000+number[5]*500;
		
		System.out.println("�`���B��"+total+"��");
		
		
		

	}

}
