
import java.util.Scanner;
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int a[][]=new int[4][2];
        a[0][0]=78;
        a[0][1]=100;
        a[1][0]=59;
        a[1][1]=80;
        a[2][0]=90;
        a[2][1]=70;
        a[3][0]=65;
        a[3][1]=120;
       
	
	double average_grade_for_person3=0;
	average_grade_for_person3=(a[2][0]+a[2][1])/2.0;
	double average_grade_for_chinese=0;
	average_grade_for_chinese=(a[0][0]+a[1][0]+a[2][0]+a[3][0])/4.0;
	double average=0;
	average=(a[0][0]+a[1][0]+a[2][0]+a[3][0]+a[0][1]+a[1][1]+a[2][1]+a[3][1])/8.0;
	
	System.out.println("丙的平均分數 :"+average_grade_for_person3);
	System.out.println("國文成績的平均分數:"+average_grade_for_chinese);
	System.out.println("全班的平均分數:"+ average);	
	 	
	}
	

}
