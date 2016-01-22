

public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[][]grade={ {78,100},
                     {59,80},
                     {90,70},
                     {65,120}
    		  };
      System.out.println(grade[2][4]);
      int k;
      for(int i=0;i<grade.length-1;i++){
    	  for(int j=0;j<grade.length-1;j++){
    		  k=(int) ((grade[1][3]+grade[2][3])/2);
    		  System.out.println(k);}
      }

      int m;
	for(int i=0;i<grade.length-1;i++){
    	  for(int j=0;j<grade.length-1;j++){
    		  m=(int) ((grade[1][1]+grade[1][2]+grade[1][3]+grade[1][4])/4);
    		  System.out.println(m);
    		  }
      
	}
	
	
	}
	  
      


}
	
	


