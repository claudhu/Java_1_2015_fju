
import java.util.Scanner;
public class election {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please select your choice:");
	System.out.println("(�@)�B������ (�G)�B�����^ (�T)�B������");
	int a = 0,b = 0,c =0 ,d = 0;

	for (int i = 10 ; i >= 1 ; i--){
		System.out.println("��������`�Τj��A�п�J�A���벼��ܡA�ثe�A�٦�" + i + "�i�ﲼ");
		int ans = input.nextInt();
	    if (ans == 1)
	    	a++;
	    else if (ans ==2 ){
	    	b++;}
	    else if (ans == 3){
	    	c++;}
	    else {
	    	d++;}
	    
	}
	
	System.out.println("(�@.)������" + a + "��");
	System.out.println("(�G.)�����^" + b + "��");
	System.out.println("(�T.)������" + c + "��");
	System.out.println("(�|.)�o��" + d + "��");
	    	 
		
	
		
}
}