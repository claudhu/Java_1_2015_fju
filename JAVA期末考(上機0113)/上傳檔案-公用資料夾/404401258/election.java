
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("���إ����`�Τj��A�п�J�z���벼��ܡA�ثe�z�٦�10�i�ﲼ\n(�@)�B������"
				+ "\n(�G)�B�����^\n(�T)�B������\n(�|)�B�o��");
		
		int num[] = new int[4];
		
		for(int i=10 ; i>=1 ; i--){
			if(i<10)
				System.out.println("�ثe�z�٦�"+i+"�i�ﲼ");
			
			int x = input.nextInt();
			if(x>=4 || x<=0)
				num[0]++;
			else
				num[x]++;
		}
		
		System.out.println("�j�ﵲ�G�έp : \n(�@)�B������"+num[1]+"��\n(�G)�B�����^"+num[2]+"��\n"
				+ "(�T)�B������"+num[3]+"��\n(�|)�B�o��"+num[0]);
		
		
		
	}

}
