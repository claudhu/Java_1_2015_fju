

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={20,8,7,50,30,90,78,15,12,100,7};
		
		int b[]=selectionSearch(num);
		
		for(int x=10;x>=0;x--){
		System.out.print(b[x]+" ");
		}
	}
  
public static int[]selectionSearch(int num[]){
    	for(int i=0;i<num.length-1;i++){
    		int min=num[i];
    		int index=i;
    		for(int j=0;j<num.length;j++){
    			if(min>num[j]){
    				min=num[j];
    				index=j;
    			}if(min!=num[i]){
    			num[index]=num[i];
    			num[i]=min;
    			
    		}
    		}
    		
    	}return num;
    }

}
