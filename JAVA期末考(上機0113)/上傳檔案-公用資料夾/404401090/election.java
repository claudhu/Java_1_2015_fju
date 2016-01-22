
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("羆参щ布.Τ眎布");
		System.out.print("1.Χ");
		System.out.print("2.讲璣");
		System.out.print("3.Ш辰");
		System.out.print("4.紀布");
		int one =0;
		int two=0;
		int three =0;
		int four=0; 
		
		int num[]=new int [10];
		for(int a=0;a<10;a++){
			num[a]=input.nextInt();
			if(num[a]==1){
				one++;
			}
			else if(num[a]==2){
				two++;
			}
			else if(num[a]==3){
				three++;
			}
			else
				four++;
			System.out.print("临逞"+(9-a)+"眎布");
		}
        System.out.println("挡狦参璸");
        System.out.println("1腹Χ"+one+"布");
        System.out.println("2腹讲璣"+two+"布");
        System.out.println("3腹Ш辰"+three+"布");
        System.out.println("紀布"+four+"布");
	}

}
