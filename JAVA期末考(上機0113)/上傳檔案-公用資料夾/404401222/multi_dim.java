
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int[4][2];
		
		num[0][0] = 78;
		num[0][1] = 100;
		num[1][0] = 59;
		num[1][1] = 80;
		
		num[2][0] = 90;
		num[2][1] = 70;
		num[3][0] = 65;
		num[3][1] = 120;
		double k = (num[0][0] + num[0][1] + num[1][0] +num[1][1] + num[2][0] + num[2][1] + num[3][0] + num[3][1])/8;
		
		System.out.println("������������:" + (num[2][0] + num[2][1])/2 +"��");
		System.out.println("��妨�Z����������:" + (num[0][0] + num[1][0] + num[2][0] + num[3][0])/4 + "��");
		System.out.println("���Z��������:" + k + "��");

    }
}
