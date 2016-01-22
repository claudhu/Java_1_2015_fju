

public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grade = new int[3][1];
		grade[0][0] = 78;
		grade[1][0] = 59;
		grade[2][0] = 90;
		grade[3][0] = 65;
		grade[0][1] = 100;
		grade[1][1] = 80;
		grade[2][1] = 70;
		grade[3][1] = 120;
		
		int average = (grade[2][0] + grade[2][1])/2 ;
		System.out.print("丙的平均"+average);
		
		int a = (grade[0][0]+grade[1][0]+grade[2][0]+grade[3][0])/4;
		System.out.print("國文平均"+a);
	}

}
