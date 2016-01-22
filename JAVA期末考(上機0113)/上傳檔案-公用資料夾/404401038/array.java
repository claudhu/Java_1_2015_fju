
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {20,8,7,50,30,90,78,15,12,100,7};
int count = 0 ;
for(int i = 0 ; i < array.length ; i++){
	if(array[i] != 78){
		count++;
	}
	else{
		break ;
	}
}
System.out.println("需要" + count + "次搜尋");
int temp = 0 ;
for(int i = 0 ; i < array.length ; i++){
	int a = 0 ;
	temp = array [i] ;
	for(int j = i ; j < array.length ; j++){
		if(array[j] <= temp){
			temp = array[j];
			a = j ;
		}
	}
	array[a] = array[i] ;
	array[i] = temp ;
}
System.out.println("由小至大排列:");
for(int i = 0 ; i < array.length ; i++){
	System.out.print(array[i] + " ");
}


	}

}
