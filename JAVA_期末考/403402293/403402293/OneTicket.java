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
public class OneTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("請輸入代碼及數量=");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=0;
        if(num1==1){
            num3=num2*3000;
            System.out.println("you have to pay :"+num3);
        }else if(num1==2){
            num3=num2*2500;
            System.out.println("you have to pay :"+num3);
        }else if(num1==3){
            num3=num2*2000;
            System.out.println("you have to pay :"+num3);
        }else if(num1==4){
            num3=num2*1000;
            System.out.println("you have to pay :"+num3);
        }else{
             num3=num2*500;
            System.out.println("you have to pay :"+num3);
        }
        // TODO code application logic here
    }
    
}
