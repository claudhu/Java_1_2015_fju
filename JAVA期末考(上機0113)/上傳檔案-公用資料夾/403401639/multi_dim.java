

public class multi_dim {

	public static void main(String[] args) {
		int array[][] = {{78,100},{59,80},{90,70},{65,120}};
		System.out.printf("　　　  國文　　　 數學\n");
		System.out.printf(" 甲");
		
			for(int j=0; j<array[0].length; j++){
		System.out.printf("　　　%d",array[0][j]);
			
		}
		System.out.printf("\n");
		
		System.out.printf(" 乙");
		
			for(int j=0; j<array[1].length; j++){
		System.out.printf("　　　%d",array[1][j]);
		}
		System.out.printf("\n");
		
		System.out.printf(" 丙");
		
			for(int j=0; j<array[2].length; j++){
		System.out.printf("　　　%d",array[2][j]);
			
		}
		System.out.printf("\n");
		
		System.out.printf(" 丁");
		
			for(int j=0; j<array[3].length; j++){
		System.out.printf("　　　%d",array[3][j]);
			
		}
		System.out.printf("\n");
		
		System.out.printf("丙的平均分數:");
		int sum=0,avg=0;
		for(int i=0; i<array[2].length; i++){
			sum+=array[2][i];
		}
		avg = sum/2;
		System.out.printf("%d\n",avg);
		
		System.out.printf("國文成績的平均分數:");
		int sum2=0,avg2=0;
		for(int i=0; i<array.length; i++)
			sum2+=array[i][0];
		avg=sum2/4;
		System.out.printf("%d\n",avg);
		
		System.out.printf("全班的平均分數:");
		int sum3=0,avg3=0;
			for(int i=0; i<array.length; i++){
				for(int j=0; j<array[i].length; j++){
					sum3+=array[i][j];
				}
			}
			avg3=sum3/8;
			System.out.printf("%d",avg3);

	}

}
