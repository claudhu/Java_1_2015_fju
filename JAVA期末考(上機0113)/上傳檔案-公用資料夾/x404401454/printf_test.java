import java.util.Scanner;


public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int[] mylist =  new int[8] ;
        System.out.println("請輸入8個數");
        for(int i=0 ; i<mylist.length ; i++){
        	mylist[i]=input.nextInt();
        }
        System.out.printf("%9d%9d%9d%9d\n",mylist[0],mylist[1],mylist[2],mylist[3]);
        System.out.printf("%9d%9d%9d%9d",mylist[4],mylist[5],mylist[6],mylist[7]);
        
	}

}
