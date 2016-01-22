

public class multi_dim {

	public static void main(String[] args) {
		int array[][] = {{78,100},{59,80},{90,70},{65,120}};
		System.out.printf("  瓣ゅ 计厩\n");
		System.out.printf(" ヒ");
		
			for(int j=0; j<array[0].length; j++){
		System.out.printf("%d",array[0][j]);
			
		}
		System.out.printf("\n");
		
		System.out.printf(" ");
		
			for(int j=0; j<array[1].length; j++){
		System.out.printf("%d",array[1][j]);
		}
		System.out.printf("\n");
		
		System.out.printf(" ");
		
			for(int j=0; j<array[2].length; j++){
		System.out.printf("%d",array[2][j]);
			
		}
		System.out.printf("\n");
		
		System.out.printf(" ");
		
			for(int j=0; j<array[3].length; j++){
		System.out.printf("%d",array[3][j]);
			
		}
		System.out.printf("\n");
		
		System.out.printf("キАだ计:");
		int sum=0,avg=0;
		for(int i=0; i<array[2].length; i++){
			sum+=array[2][i];
		}
		avg = sum/2;
		System.out.printf("%d\n",avg);
		
		System.out.printf("瓣ゅΘ罿キАだ计:");
		int sum2=0,avg2=0;
		for(int i=0; i<array.length; i++)
			sum2+=array[i][0];
		avg=sum2/4;
		System.out.printf("%d\n",avg);
		
		System.out.printf("痁キАだ计:");
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
