import java.util.Scanner;

public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner input = new Scanner(System.in) ;
	
	int[][] score = new int[4][2] ;
	System.out.println("Please enter the Chinese and Math scores of 4 students: ") ;
	
	for(int i=0; i<score.length; i++) {
		for(int j=0; j<score[i].length; j++) {
			score[i][j] = input.nextInt();
		}
	}
	
	//Average score of C 
	int a = score[3][0] ;
	int b = score[3][1] ;
	int average = (a+b)/2 ;
	System.out.println("1.The average score of C is: " + average) ;
	
	//Average score of Chinese ;
	int total = 0 ;
	for(int k=0; k<score.length; k++) {
		total = total + score[k][0] ;
	}
	int average2 = total/4 ;
	System.out.println("2.The average score of Chinese is: " + average2) ;
	
	//Average score of total ;
	int total2 = 0 ;
	for(int m=0; m<score.length; m++) {
		int average3 = (score[m][0]+score[m][1])/2 ;
		total2 = total2 + average3 ;
	}
	int average4 = total2/4 ;
	System.out.println("3.The average score of all is: " + average4) ;
	
	
	}

}
