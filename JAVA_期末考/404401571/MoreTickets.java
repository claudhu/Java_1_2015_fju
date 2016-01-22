
import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("叫块布絏(vip)眤璶眎计");
		int n1= input.nextInt();
		System.out.println("叫块布絏(碵)眤璶眎计");
		int n2= input.nextInt();
		System.out.println("叫块布絏(玡い初)眤璶眎计");
		int n3= input.nextInt();
		System.out.println("叫块布絏(オ初)眤璶眎计");
		int n4= input.nextInt();
		System.out.println("叫块布絏き(程蔼跋畒)眤璶眎计");
		int n5= input.nextInt();
		
		int price = ((3000*n1)+(2500*n2)+(2000*n3)+(1000*n4)+(500*n5));
		System.out.println("眤潦禦"+n1+"眎縢絏布  "+n2+"眎縢絏布 "+n3+"眎縢絏布 "+n4+"眎縢絏布 "+n5+"眎縢絏き布");
		System.out.println("羆肂:"+price);
	

	}

}
