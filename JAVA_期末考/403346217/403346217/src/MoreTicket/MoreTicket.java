/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
/**
 *
 * @author user
 */
public class MoreTicket {
    public static void main(String[] args) {
        int price =0, a=0, b=0, c=0, d=0, e=0, total=0, code, n;
        Scanner input = new Scanner(System.in);
        do{
        System.out.print("請輸入門票代碼: ");
        code = input.nextInt();
        System.out.print("請輸入數量: ");
        n = input.nextInt();
       
        switch(code){
            
            case 1:
                a = 3000*n;
                
                total+=a;
                break;
                
            case 2:
                b = 2500*n;
                
                total+=b;
                break;
            case 3:
                c = 2000*n;
                
                total+=c;
                break;
            case 4:
                d = 1000*n;
                
                total+=d;
                break;
            case 5:
                price = 500*n;
                
                total+=e;
                break;
                
        }
    }while(code!=0);
        System.out.println("所購買門票的總金額: " +total);
}
}
