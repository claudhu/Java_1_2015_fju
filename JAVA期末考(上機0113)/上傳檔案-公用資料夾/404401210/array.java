

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] list = {12,8,7,50,30,90,78,15,12,100,7};
		System.out.println("1. �C�Q�K����m�b�G"+ LinearSearch(list , 78 )) ;
		System.out.println("2. �C�Q�K����m�b�G"+ BinarySearch(list , 78 )) ;
	}
	public static int LinearSearch(int [] a , int k ){
		int count = 0 ;
		for(int i = 0 ; i < a.length ; i++ ){
			count ++ ;
			if(a [i] == k ){
			  System.out.println("�u�ʷj�M���Ƭ��G"+ count) ;
			return i;
			}
		}
		System.out.println("�u�ʷj�M���Ƭ��G"+ count) ;
		return -999 ;
	}
	public static int BinarySearch(int [] b , int k ){
		//�ƦC�}�C
		for(int i = 0 ; i < b.length ; i++ ){
			int nowmini = b[i] ;
			int nowindex = i ;
			for(int j = 0 ; j < b.length ; j++ ){
				if(b[j] < nowmini){
					nowmini = b[j] ;
					nowindex = j ;
				}	
			}
			if(nowmini != b[i]){
				b[nowindex] = b[i] ;
				b[i] = nowmini ;
		    }
			
	    }
		//Binary Start!
		int high = 10 ;
		int low = 0 ;
		int mid = (high + low) / 2;
		int count = 1 ;
		while(b[mid] != k){
			count++ ;
			if(b[mid] < k)
				low = mid + 1 ;
			else
				high = mid - 1 ;	
		}
		System.out.println("�j�M���Ƭ��G"+ count) ;
		return mid ;
		
		
}

		

}
