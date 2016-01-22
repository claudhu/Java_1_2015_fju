import java.util.Scanner;
public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int g = input.nextInt();
        int h = input.nextInt();
        
        System.out.printf("\n %6d%12d%13d%13d\n%7d%12d%13d%13d" ,a,b,c,d,e,f,g,h);
        
    
	}

}
