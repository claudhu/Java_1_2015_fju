
import java.util.Scanner;
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list [][] = new int [4][2] ;
		list[0][0] = 78 ;
		list[0][1] = 100 ;
		list[1][0] = 59 ;
		list[1][1] = 80 ;
		list[2][0] = 90 ;
		list[2][1] = 70 ;
		list[3][0] = 65 ;
		list[3][1] = 120 ;
		
		System.out.println("    瓣ゅ      计厩");
		for (int i = 0 ; i < list.length ; i ++)
		{
			int count = 0 ;
			for (int j = 0 ; j <list[0].length ; j++)
			{
				System.out.printf("%4d" , list[i][j]);
				count ++ ;
				if (count % 2 == 0)
					System.out.println();
			}
		}
		
		double av1 = (list[2][0] + list[2][1])/2;
		
		double total = 0 ;
		for (int i = 0 ; i < list.length ; i++)
		{	
			total += list[i][0] ;
		}
		
		double all = 0 ;
		for (int i = 0 ; i < list.length ; i++)
		{
			for (int j = 0 ; j < list[j].length ; j++)
			{
				all += list[i][j] ;
			}
		}
		
		System.out.println("キАだ计 : " + av1);
		System.out.println("瓣ゅΘ罿キАだ计 : " + total / 4);
		System.out.println("痁キАだ计 : " + all / 8);
	}

}
