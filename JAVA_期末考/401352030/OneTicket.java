import java.util.Scanner;


public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("叫块璶潦禦布絏");
		int code=input.nextInt();
		System.out.println("叫块眤璶潦禦布计秖");
		int q=input.nextInt();
		if(code==1){
			int p1=3000*q;
			System.out.println("羆基:"+p1+"じ");
			}
		else if(code==2){
			int p2=2500*q;
			System.out.println("羆基:"+p2+"じ");
			}
		else if(code==3){
			int p3=2000*q;
			System.out.println("羆基:"+p3+"じ");
			}
		else if(code==4){
			int p4=1000*q;
			System.out.println("羆基:"+p4+"じ");
			}
		else if(code==5){
			int p5=500*q;
			System.out.println("羆基:"+p5+"じ");
			}
		else
			System.out.println("眤块戈癟Τ粇");
				

	}

}
