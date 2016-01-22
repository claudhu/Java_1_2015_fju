import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = 0 ;
		int b = 0 ;
		int c = 0 ;
		int d = 0 ;
		
for(int i = 1 ; i <= 10 ; i--){
	i = input.nextInt();
	switch(i % 4){
	case 0 : a++;
	break;
	case 1 : b++;
	break;
	case 2 : c++;
	break;
	case 3 : d++;
	
	}
	
	
}
System.out.println("匡挡狦参璸");
System.out.println("()Χ "+ b++ + "布");
System.out.println("()讲璣 "+ c++ + "布");
System.out.println("()Ш辰 "+ d++ + "布");
System.out.println("()紀布 "+ a++ + "布");
	}

}
