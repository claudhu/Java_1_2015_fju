
public class multi_dim {

	public static void main(String[] args) {
		double a=0,b=0;
		int grade[][]={{78,59,90,65},{100,80,70,120}};
		System.out.println("丙的平均分數為:"+(grade[0][2]+grade[1][2])/2);
		for(int i=0;i<4;i++)
			 a+=grade[0][i];
		System.out.println("國文平均分數為:"+a/4);
		for(int i=0;i<2;i++)
			for(int j=0;j<4;j++)
				b+=grade[i][j];
			
		System.out.println("全班平均分數為:"+b/8);

	}

}
