import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
   String lottery =  ""+(Math.random()*10)+(Math.random()*10)+(Math.random()*10);
   
   System.out.println("���100~999���䤤�@�ӼƦr");
   
   
      char lotteryNumber1 = lottery.charAt(0);
      char lotteryNumber2 = lottery.charAt(1);
      char lotteryNumber3 = lottery.charAt(2);
      
      
      System.out.println("the random number is:"+lottery);
	}

}
