

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] a={20,8,7,50,30,90,78,15,12,100,7};
         int count=0;
        for(int i=0;i<a.length;i++){
        	if(a[i]==78){
        		count++;
        	break;}
        	else
        	
        		count++;
        	
        }
        System.out.println("(1)");
        System.out.println("�j�M78�ݭn"+count+"�����j�M");
        System.out.println("(2)");
        
    	
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
		
		
		}
		Arrays.sort(a);
		boolean yes=false;
		
		int high=a.length,low=0,count1=0;
		int mid=(high+low)/2;
		while(high-low>2){
			
			
			if(78>a[mid]){
				high=mid;
				
			
			if(78==a[mid]){
				yes=true;
				count1++;
				break;
			}
			else
				low=mid;
				count1++;
		}
		
		if(true){
			System.out.println("(3)");
			System.out.println("�j�M78�j�M�F"+count1+"��");
		}
	}
	}
	}
