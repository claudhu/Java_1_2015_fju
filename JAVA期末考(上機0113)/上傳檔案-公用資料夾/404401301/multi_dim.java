

public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[][]=  {{78,100},
		                 {59,80},
		                 {90,70},
		                 {65,120}};
		                
		int a = 0;
		a=(array[3][0]+array[3][1])/2;
		System.out.println("�����������Z" + a);
		
		int b=0;
		for(int i = 0 ; i<array.length ; i++)
		b+=array[i][0]/4;
	    System.out.println("��妨�Z���������Z" + b);
	    
	    int c=0;
	    for(int i =0 ; i<array.length ; i++){
	    	for(int j =0; j<array[i].length ; j++){
	    		c+=array[i][j]/8;
	    	}
	    }
	    System.out.println("���Z���������Z" + c);
	
	}
		
}


