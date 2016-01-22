public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grade = new int[4][2];
		grade[0][0] = 78;
		grade[0][1] = 100;
		grade[1][0] = 59;
		grade[1][1] = 80;
		grade[2][0] = 90;
		grade[2][1] = 70;
		grade[3][0] = 65;
		grade[3][1] = 120;
		double a = (grade[0][0] + grade[0][1]) / 2;
		double b = (grade[1][0] + grade[1][1]) / 2;
		double c = (grade[2][0] + grade[2][1]) / 2;
		double d = (grade[3][0] + grade[3][1]) / 2;
		System.out.println("丙的平均分數為: " + c);
		System.out.println("國文成績的平均分數為: "
				+ (grade[0][0] + grade[1][0] + grade[2][0] + grade[3][0]) / 4);
		System.out.println("全班的平均分數: " + (a + b + c + d) / 4);

	}

}
