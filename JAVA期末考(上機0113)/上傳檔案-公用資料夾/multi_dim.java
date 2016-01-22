
import java.util.Scanner;
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter grades : ");
		int grade [][]=new int[2][4];
		//78,100,59,80,90,70,65,120
		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++){
				grade[i][j]=input.nextInt();
			}
		}
		double grade1=(grade[0][2]+grade[1][2])/2;
		double grade2=(grade[0][0]+grade[0][1]+grade[0][2]+grade[0][3])/4;
		double grade3=(grade[0][0]+grade[0][1]+grade[0][2]+grade[0][3]+grade[1][0]+grade[1][1]+grade[1][2]+grade[1][3])/8;
		System.out.println("丙的平均成績 : "+grade1);
		System.out.println("國文成績的平均分數 : "+grade2);
		System.out.println("全班的平均分數 : "+grade3);

	}

}
