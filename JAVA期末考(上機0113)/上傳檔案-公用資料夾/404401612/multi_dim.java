
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("         國文         數學 ");
		
		int score[][] = { { 78 , 100 } , { 59 , 80 } , { 90 , 70 }
		,{ 65 , 120 } } ;
		
		for ( int i = 0 ; i < score.length ; i ++){
			if ( i == 0 ){
				System.out.print("甲  ");
			}
			else if ( i == 1 ){
				System.out.print("乙 ");
			}
			else if ( i == 2 ){
				System.out.print("丙 ");
			}
			else if ( i == 3 ){
				System.out.print("丁 ");
			}
			for ( int j = 0 ; j < score[i].length ; j++){
				System.out.printf("   %-2d",score[i][j]);
			}
			System.out.println();
		}
		//丙
		int sum1 = 0 ;
		for ( int i = 0 ; i < 2 ; i ++){
			sum1 = sum1 + score[2][i];
		}
		double average1 =( double ) sum1 / 2 ;
		
		// 國文成績
		int sum2 = 0 ;
		for ( int i = 0 ; i < 4 ; i ++){
			sum2 = sum2 + score[i][0];
		}
		double average2 =( double ) sum2 / 4 ;
		
		// 全班平均
		int s1 = 0 ;
		double a1 = 0 ;
		for ( int i = 0 ; i < 2 ; i ++){
			s1 = s1 + score[0][i];
		}
		a1 =(double) s1 / 2 ; 
		
		int s2 = 0 ;
		double a2 = 0 ;
		for ( int i = 0 ; i < 2 ; i ++){
			s2 = s2 + score[0][i];
		}
		a2 =(double) s2 / 2 ; 
		
		int s3 = 0 ;
		double a3 = 0 ;
		for ( int i = 0 ; i < 2 ; i ++){
			s3 = s3 + score[0][i];
		}
		a3 =(double) s3 / 2 ; 
		
		int s4 = 0 ;
		double a4 = 0 ;
		for ( int i = 0 ; i < 2 ; i ++){
			s4 = s4 + score[0][i];
		}
		a4 =(double) s4 / 2 ; 
		
		double avg = ( a1 + a2 + a3 + a4 )/ 4 ;
		
		System.out.println("丙的平均分數:" + average1);
		System.out.println("國文成績的平均分數:"+ average2);
		System.out.println("全班的平均分數:"+ avg);
	}

}
