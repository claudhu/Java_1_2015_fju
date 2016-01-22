import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in );
		
		System.out.print("Please enter the three numbers : ") ;
		int[] list = new int[3] ;
		for(int i=0; i<list.length; i++) {
		list[i] = input.nextInt() ;
		}

		int currentMin = list[0] ;
		int Index=0 ;
		for(int j=0; j<list.length; j++) {
			for(int k=j; k<list.length; k++) {
				if( list[k]<list[j] ) {
					currentMin = list[k] ;
					Index = k ;
					int tem;
					tem = list[j] ;
					list[j] = list[Index] ;
					list[Index] = tem ;
				}
				
			}

		}
		

		
		System.out.print("The sorting result is as follows : " + list[0] + "  " + list[1] + "  " + list[2] ) ;
	}

}
