import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("輸入門票代碼(1~5):");
    int a = input.nextInt();
    System.out.println("輸入所需張數:");
    int b = input.nextInt();
    if (a==1){
         a=3000;
    }
    else if (a==2){
    	a=2500;
    }
    else if (a==3){
    	a=2000;
    }
    else if (a==4){
    	a=1000;
    }
    else {
    	a=500;
    }
    
    
    System.out.println("總共"+a*b+"元");
    
	}

}
