import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J�����N�X�μƶq");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a==1)
			System.out.print("�`���B�O"+(3000*b));
		    
	    if(a==2)
	    	System.out.print("�`���B�O"+(2500*b));
		    
		if(a==3)
			System.out.print("�`���B�O"+(2000*b));
		    
		if(a==4)
			System.out.print("�`���B�O"+(1000*b));
		    
		if(a==5)
		   	System.out.print("�`���B�O"+(500*b));
		    
		}
		
	}


