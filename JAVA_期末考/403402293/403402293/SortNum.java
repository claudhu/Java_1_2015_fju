/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @author user
 */
public class SortNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please insert three numbers:");
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
         System.out.println("The sorting result is as follows:");
       int temp=0;
       int[] a={x ,y ,z};
       for(int i = 0 ;i < a.length-1;i++){
           for(int j=i+1;j<a.length;j++){
           if(a[i]>a[j]){
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
           } 
       }
       
       }for(int k = 0 ;k < a.length;k++){
          
            System.out.printf("%3d",a[k]);
}
        // TODO code application logic here
    }
}
    
