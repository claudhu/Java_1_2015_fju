

public class multi_dim {

	public static void main(String[] args) {
		int[][] score = { { 78, 100 }, { 59, 80 }, { 90, 70 }, { 65, 120 } };

		// 丙平均分數
		int threescore = (score[2][0] + score[2][1]) / 2;
		System.out.printf("丙平均分數為： %d 分", threescore);

		// 國文成績平均
		int chinese_score = 0;
		for (int i = 0; i < score.length; i++) {

			chinese_score += score[i][0];
		}
		chinese_score /= 4;
		System.out.printf("\n國文平均成績： %d 分", chinese_score);

		// 全班平均成績
		int all_score = 0;
		for (int j = 0; j < score.length; j++) {
			for (int k = 0; k < 2; k++) {
				all_score += score[j][k];
			}
		}
		all_score /= 8;
		System.out.printf("\n全班平均成績： %d 分", all_score);
	}

}
