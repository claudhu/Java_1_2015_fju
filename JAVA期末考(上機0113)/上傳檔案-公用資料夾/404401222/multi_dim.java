
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
		
		System.out.println("丙的平均分數:" + (num[2][0] + num[2][1])/2 +"分");
		System.out.println("國文成績的平均分數:" + (num[0][0] + num[1][0] + num[2][0] + num[3][0])/4 + "分");
		System.out.println("全班平均分數:" + k + "分");

    }
}
