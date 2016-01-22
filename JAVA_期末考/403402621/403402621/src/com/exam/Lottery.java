
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int r=(int)((double)(Math.random()*9+1)*100);
		System.out.println("Please enter the number:");
		int enter=input.nextInt();
		System.out.println("The random number is:"+r);
		int money;
		if((enter-r)%100==0){
			money=6000;
			System.out.print("You win the third prize, money award is"+money);
		}
		else if(enter==r){
			money=10000;
			System.out.print("You win the first prize, money award is"+money);
		}
		int[] d=new int[3];
		for(int i=0;i<d.length;i++){
			d[i]=enter%10;
			enter=enter/10;
		}
		int[] e=new int[3];
		for(int i=0;i<e.length;i++){
			e[i]=r%10;
			r=r/10;
		}
		if((d[1]==e[1]||d[1]==e[2]||d[1]==e[3])&&(d[2]==e[1]||d[2]==e[2]||d[2]==e[3])&&(d[3]==e[1]||d[3]==e[2]||d[3]==e[3])){
			money=8000;
			System.out.print("You win the second prize, money award is"+money);
		}
		else{
			System.out.print("Sorry!");
		}

	}

}
