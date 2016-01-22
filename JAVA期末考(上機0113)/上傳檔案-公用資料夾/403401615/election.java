
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		for(int i = 1 ; i <=10 ; i++){
		System.out.println("い瓣チ羆参匡щ眎布叫块щ布匡拒ヘ玡щ材 " + i + " 眎匡布 ");
		System.out.println("() Χ");
		System.out.println("()讲璣");
		System.out.println("()Ш寒");
		System.out.println("()紀布");
		
		int vote = sc.nextInt();
		
		
		switch(vote){
		
		case 1 : System.out.println("щΧ布");break;
		case 2 : System.out.println("щ讲璣布");break;
		case 3 : System.out.println("щШ寒布");break;
		case 4 : System.out.println("щ紀布布");break;
		}
		System.out.println("匡挡狦参璸: ");
		System.out.println("() Χ "+ vote + " 布");
		System.out.println("()讲璣 "+ vote + " 布");
		System.out.println("()Ш寒 "+ vote + " 布");
		System.out.println("()紀布 "+ vote + " 布");
	}

}
}