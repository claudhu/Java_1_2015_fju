
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int list [] = {20,8,7,50,30,90,78,15,12,100,7};
		
		//�u��//
		int num = 0;
		for(int i = 0 ; i < list.length ; i++){
			if(list[i] == 78){
				num = i;
			}
			
		}
		System.out.println("�j�M�F " + (num+1) + " ��");
		
		
		//�Ƨ�//
		int temp = 0;
		for(int i = 0 ; i < list.length ; i++){
			for(int j = 0 ; j+1 < list.length ; j++){
				if(list[j+1] < list[j]){
					temp = list[j+1];
					list[j+1] = list[j];
					list[j] = temp;
				}
				
				
			}
		}
		for(int i = 0 ; i < list.length ; i++){
			System.out.print(list[i] + " ");
			
			
		}

		
		System.out.println("");

		
		//�G��//
		
		int lon = list.length-1;
		int num2 = 0;
		int x = 0;
		int ave = 0;
		
		for(int i = 0 ; i < list.length ; i++){

			for(int j = 0 ; j < list.length ; j++){
				ave = (list[x] + list[lon]) / 2;

				if(list[j] > ave){
					num2 ++;
					x = j;
				}
				

			}
			
		}
			
		System.out.println("�j�M�F " + (num2+1) + " ��");

		

		
		
		
	}

}
