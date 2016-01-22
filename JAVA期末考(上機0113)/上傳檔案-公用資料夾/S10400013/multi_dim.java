
public class multi_dim {

	public static void main(String[] args) {
		
		int [][] Score =new int[4][2];
		
		int total = 0;
		
		Score[0][0]=78;
		Score[0][1]=100;
		Score[1][0]=59;
		Score[1][1]=80;
		Score[2][0]=90;
		Score[2][1]=70;
		Score[3][0]=65;
		Score[3][1]=120;
		
		System.out.printf("丙的平均分數:%d\n",(Score[2][0]+Score[2][1])/2);
		System.out.printf("國文成績的平均分數:%d\n",(Score[0][0]+Score[1][0]+Score[2][0]+Score[3][0])/4);
		
		for (int i =0 ;i<4;i++){
			
			for (int j =0 ;j<2;j++)
				total+=Score[i][j];
			
		}
		System.out.printf("全班的平均分數:%d",total/8);
	}
		

}
