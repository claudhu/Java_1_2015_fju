
public class polindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("�п�J�@�ӳ���A�˴���O�_���^��?");
		
		String x = input.nextLine();
		boolean is = true;
		for(int i=x.length()-1,k=0 ; i>k ; i--,k++){
			if(x.charAt(i) != x.charAt(k)){
				is = false;
				break;
			}
			
		}
		if(is)
			System.out.println("�ӵ��J�O�^��");
		else
		    System.out.println("�ӵ��J���O�^��");
		

	}

}
