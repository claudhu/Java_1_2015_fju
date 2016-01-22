

public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myList = new int[4][2];
		myList[0][0] = 78 ;
		myList[0][1] = 100;
		myList[1][0] = 59 ;
		myList[1][1] = 80 ;
		myList[2][0] = 90 ;
		myList[2][1] = 70 ;
		myList[3][0] = 65 ;
		myList[3][1] = 120;
		double number = (myList[0][0]+myList[0][1]+myList[1][0]
				+myList[1][1]+myList[2][0]+myList[2][1]
						+myList[3][0]+myList[3][1])/8;
		System.out.println("丙的平均分數是:" + (myList[2][0]+myList[2][1])/2+"分");
		System.out.println("國文平均分數是:" + (myList[0][0]+myList[1][0]+myList[2][0]
											+myList[3][0])/4+"分");
		System.out.println("全班平均分數是:" + number +"分");
	}

}
