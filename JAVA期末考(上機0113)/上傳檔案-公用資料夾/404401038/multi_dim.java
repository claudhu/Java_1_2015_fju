import java.util.Scanner;
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int[][] array = {{78,100},{59,80},{90,70},{65,120}};
double average3 = (array[2][0] + array[2][1]) / 2 ;
System.out.println("丙的平均分數" + average3);
int totala = 0 ;
for(int i = 0 ; i < array.length; i++){
    totala += array[i][0];
}
double averagea = totala / (array.length + 1);
System.out.println("國文成績的平均分數" + averagea);
int totalb = 0 , count = 0;
for(int i = 0 ; i < array.length; i++){
    for(int j = 0 ; j < array[i].length ; j++){
    	totalb += array[i][j];
    	count++;
    }
}
double avearageb = totalb / count ;
System.out.println("全班的平均分數" + avearageb);
	}

}
