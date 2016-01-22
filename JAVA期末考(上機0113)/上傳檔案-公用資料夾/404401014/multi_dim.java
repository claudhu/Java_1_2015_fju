
public class multi_dim {

	public static void main(String[] args) {
		int array[][] = {{78, 100}, {59, 80}, {90, 70}, {65, 120}};
		
		//question1
		int total=0;
		for (int i=0; i<array[2].length; i++)
			total+=array[2][i];
		double average=total/array[2].length;
		System.out.printf("丙的平均分数: %.2f\n", average);
		
		//question2
		total=0;
		for (int i=0; i<array.length; i++)
			total+=array[i][0];
		average=total/array.length;
		System.out.printf("国文成绩的平均分数: %.2f\n", average);
		
		//question3
		total=0;
		for (int i=0; i<array.length; i++)
			for (int j=0; j<array[i].length; j++)
				total+=array[i][j];
		average=total/(array.length*array[0].length);
		System.out.printf("全班的平均分数: %.2f\n", average);
	}
}
