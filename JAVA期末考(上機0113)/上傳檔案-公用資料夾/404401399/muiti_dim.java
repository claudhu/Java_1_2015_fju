

public class muiti_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade[][] = {{78,100,
			              59,80,
			              90,70,
			              65,120}};
		
		
		double a1= (grade[3][1]+grade[3][2])/2;
		double a2= (grade[1][1]+grade[2][1]+grade[3][1]+grade[3][1])/2;
		
		System.out.println("丙的平均分數:"+a1);
		System.out.println("國文成績的平均是:"+a2);

	}

}
