
public class multi_dim {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[4][2];
		for(int i=0;i<4;i++){
			a[0][0]=78;
			a[1][0]=59;
			a[2][0]=90;
			a[3][0]=65;
			a[0][1]=100;
			a[1][1]=80;
			a[2][1]=70;
			a[3][1]=120;
			}
		int sumc=0;
		for(int i=0;i<2;i++){
			sumc=sumc+a[2][i];
		}
		int avec=sumc/2;
		System.out.println("丙的平均分數為"+avec);
		
		int sumchi=0;
		for(int i=0;i<4;i++){
			sumchi=sumchi+a[i][0];
		}
		int avechi=sumchi/4;
		System.out.println("國文的平均分數為"+avechi);
		
		int sumt=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<2;j++)
			sumt=sumchi+a[i][j];
		}
		int avet=sumt/8;
		System.out.println("全班的平均分數為"+avet);

	}

}
