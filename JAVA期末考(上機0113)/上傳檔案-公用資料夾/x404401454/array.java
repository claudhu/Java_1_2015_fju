


public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] mylist = {20,8,7,50,30,90,78,15,12,100,7};
        int key=78;
        for(int i = 0 ; i<=mylist.length-1 ;i++){
            if(key==mylist[i])
            	System.out.println("在第"+(i+1)+"次找到");            	      
        }
        int curentmin=mylist[0];
        int curentminindex=0 ;
        for(int i = 0 ; i<mylist.length-1 ; i++){
        	curentmin=mylist[i];
        	curentminindex=i;
        for(int j = 1 ; j<mylist.length ; j++){
        	if(mylist[i]>mylist[j]){
        		curentmin=mylist[j];
        		curentminindex=j;
        	}
         }
            mylist[i]=curentmin;
            i=curentminindex; 
      }
        for(int i = 0 ; i<mylist.length;i++){
        	System.out.printf("%5d",mylist[i]);
        }
	}

}
