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
public class MoreTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("請輸入門票代碼:");
        int x = input.nextInt();
        int cost = 0, cost1=0, cost2=0 , cost3 = 0, cost4 =0;
        while(true) {
            System.out.printf("購買成功");
        if(x == 0){
            System.out.printf("tatal:%d",cost+cost1+cost2+cost3+cost4);
        }
        int i = input.nextInt();
        switch(i){
            case 1 :
                
                System.out.println("請輸入張數:");
                int a = input.nextInt();
                cost = 3000* a;
                break;
               
            case 2 :
                System.out.println("請輸入張數:");
                int b = input.nextInt();
                cost1 = 2500* b;
                break;
            case 3:
                System.out.println("請輸入張數:");
                int c = input.nextInt();
                cost2 = 2000* c;
                break;
            case 4 :
                System.out.println("請輸入張數:");
                int d = input.nextInt();
                cost3 = 1000* d;
                break;
            case 5 :
                System.out.println("請輸入張數:");
                int e = input.nextInt();
                cost4 = 500* e;
                break;
            default  = 
        }
        
        
        
    
        }}}
