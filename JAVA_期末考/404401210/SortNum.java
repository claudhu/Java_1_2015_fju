

import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Please enter the three numbers(int) ¡G ") ;
		//«Å§i¤Î¿é¤J°}¦C
		int [] lista = new int[3] ;
		for(int i = 0 ; i < lista.length ; i++){
			lista[i] = input.nextInt() ;
		}
		//±Æ§Ç°}¦C
		for(int i = 0 ; i < lista.length-1 ; i++){
			int nowmini = lista[i] ; 
			int nowindex = i ;
			
			for(int j = 1 ; j < lista.length ; j++){
				if(lista[j] < nowmini){
					nowmini = lista[j] ;
					nowindex = j ;
				}
			}
			
			if(nowmini != lista[i]){
				lista[nowindex] = lista[i] ;
				lista[i] = nowmini ;
			}
		}
		
		//¿é¥X°}¦C
		System.out.printf("The sorting result is as follows : \n%5d %5d %5d"
				,lista[0] ,lista[1] ,lista[2]);
		

	}

}
