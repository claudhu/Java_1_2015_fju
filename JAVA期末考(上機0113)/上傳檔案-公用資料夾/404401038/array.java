
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
System.out.println("�ݭn" + count + "���j�M");
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
System.out.println("�Ѥp�ܤj�ƦC:");
for(int i = 0 ; i < array.length ; i++){
	System.out.print(array[i] + " ");
}


	}

}
