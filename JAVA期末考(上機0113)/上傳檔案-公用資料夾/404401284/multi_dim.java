public class multi_dim {

	public static void main(String[] args) {
		// 五、(20%) 試以「二維陣列」建立學生成績單如右表：
		// 1. 請顯示：丙的平均分數
		// 2. 請顯示：國文成績的平均分數
		// 3. 請顯示：全班的平均分數
		/*
		        國文      數學
		甲     78   100
		乙     59    80
		丙     90    70
		丁     65   120
		
		*/
		
		int[][] arr = new int[3][1];

		arr[0][0] = 78 ;
		arr[0][1] = 100 ;
		arr[1][0] = 59 ;
		arr[1][1] = 80 ;
		arr[2][0] = 90 ;
		arr[2][1] = 70 ;
		arr[3][0] = 65 ;
		arr[3][1] = 120 ;

		System.out.println(arr);
		
		System.out.println("丙的平均分數為" + (arr[2][0]+arr[2][1])/2 );
		System.out.println("國文成績的平均分數為" + (arr[0][0]+arr[1][0]+arr[2][0]+arr[3][0])/2 );
		System.out.println("丙的平均分數為" + (arr[2][0]+arr[2][1])/2 );

		
	}
	

}
