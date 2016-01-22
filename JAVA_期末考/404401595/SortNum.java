import java.io.*;
public class SortNum {

	public SortNum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
     System.out.println("Please enter the first number:");
     System.out.println("Please enter the second number:");
     System.out.println("Please enter the third number:");
     BufferedReader  br = 
    		 new BufferedReader(new InputStreamReader(System.in));
     String str1 = br.readLine();
     String  str2 = br.readLine();
     String  str3 = br.readLine();
     int  num1 =Integer.parseInt(str1) ;
     int  num2 =Integer.parseInt(str2) ;
     int  num3 =Integer.parseInt(str3) ;
     int  [] test = {num1,num2,num3};
     
      for(int j = 0;j<test.length-1;j++){
    	  for(int i = 0;i<test.length;i++){
    		  if(test[i]<test[j]){
    			  int  tmp = test[j];
    			  test[j] = test[i];
    			  test[i] = tmp;
    			  
    		  
    		  }
    	  }
      }for(int f = 0;f<test.length-1;f++){System.out.println("The sorting result is as follows :" + test[f]  );}
    	  
      }
     
	}


