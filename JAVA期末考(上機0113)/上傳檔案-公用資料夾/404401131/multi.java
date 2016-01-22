

public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double list[][]={{78,100},{59,80},{90,70},{65,120}};
		double average=(list[2][0]+list[2][1])/2;
		System.out.println("丙的平均分數 "+average);
		double average1 =(list[0][0]+list[1][0]+list[2][0]+list[3][0])/4;
		System.out.println("國文平均分數 "+average1);
		double average2=0;
		double total=0;
		for(int i=0;i<list.length;i++){
			for(int k=0;k<list[i].length;k++){
				total=(total+list[i][k]);
			}
			
			
		}
		average2=total/8;
		System.out.println("全班平均分數 "+average2);
		}

	}


