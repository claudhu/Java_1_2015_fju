

public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[][] = new  int[2][4];
		i[0][0] = 78;
		i[0][1] = 59;
		i[0][2] = 90;
		i[0][3] = 65;
		i[1][0] = 100;
		i[1][1] = 80;
		i[1][2] = 70;
		i[1][3] = 120;
		
		System.out.println("丙的平均分數"+(i[0][2]+i[1][2])/2);
		System.out.println("國文的平均分數"+(i[0][0]+i[0][1]+i[0][2]+i[0][3])/4);
		System.out.println("全班的平均分數"+(i[0][0]+i[0][1]+i[0][2]+i[0][3]+i[1][0]+i[1][1]+i[1][2]+i[1][3])/8);
	}

}
