
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int[]perfect = new int[10];
        for(int i=1;i<=10000;i++){
	
	    for(int j=2;j<i;j++)
	     {if (i%j==0)
		 total=total+j;}
	     
	    if (total==i)
	    { for(int k=0;k<=perfect.length-1;k++)
	    perfect[k]= i;}}
	    
	    System.out.print("The perfect numbers that are less than 10000 are: \n");
	    for(int k=0;k<=perfect.length-1;k++)
	    	System.out.printf("%-5d",perfect[k]);
}
	}


