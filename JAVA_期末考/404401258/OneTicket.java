

public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("�п�J�һݭn�������N�X:");
		int x = input.nextInt();
		System.out.print("�п�J�i��:");
		int number = input.nextInt();
		switch(x){
		case 1: System.out.print("�`�@��"+number*3000+"��");break;
		case 2: System.out.print("�`�@��"+number*2500+"��");break;
		case 3: System.out.print("�`�@��"+number*2000+"��");break;
		case 4: System.out.print("�`�@��"+number*1000+"��");break;
		case 5: System.out.print("�`�@��"+number*500+"��");break;
		}
	    
	}

}
