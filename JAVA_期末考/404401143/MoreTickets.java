import java.util.Scanner;


public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		
		
		
		
		
		
		int sum=0;
	    int i=1;
		int []a={1,2,3,4,5};
	    while(i!=0){
	    	
	    System.out.println("�п�J�����N�X(1)VIP(2)�]�[(3)�e����(4)���k��(5)�̰��Ϯy��:");	
	    
		int n=input.nextInt();
		
		System.out.println("�п�J�ƶq:");	
		int num =input.nextInt();
		
		a[n-1]=n*num;
		
		if(n==0){
			for(int b=0;b<5;b++){
			sum+=a[b];
			}
			System.out.println("�`���B: "+sum);
		
		}
	    }}}
		
		
		

