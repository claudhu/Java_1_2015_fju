import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Please enter the tickets' numbers and counts:");
int[] menpiao = {3000 , 2500 ,2000 ,1000 ,500};
int[][] shue  = new int[2][100000];
int a = 0;
for(int i = 0 ; i >= 0 ; i++){
	for(int j = 0 ; j < shue.length ; j++){
		shue[j][i] = input.nextInt();
		if(shue[0][i] == 0){
			break;
		}
	}
	if(shue[0][i] == 0){
		a = i ;
		break ;
	}
}
int jine = 0 ;
for(int i = 0 ; i < a ; i++){
	jine += menpiao[shue[0][i] - 1] * shue[1][i] ;
}
System.out.println("You need to pay: " + jine + "dollars");


	}

}
