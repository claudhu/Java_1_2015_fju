


public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = new int[4][2];
		score[0][0] = 78 ;
		score[0][1] = 100;
		score[1][0] = 59 ;
		score[1][1] = 80 ;
		score[2][0] = 90 ;
		score[2][1] = 70 ;
		score[3][0] = 65 ;
		score[3][1] = 120;
		
		double number = (score[0][0]+score[0][1]+score[1][0]+score[1][1]+score[2][0]+score[2][1]
						+score[3][0]+score[3][1])/8;
		System.out.println("������������:" + (score[2][0]+score[2][1])/2+"��");
		System.out.println("��奭������:" + (score[0][0]+score[1][0]+score[2][0]
											+score[3][0])/4+"��");
		System.out.println("���Z��������:" + number +"��");
	}

}
