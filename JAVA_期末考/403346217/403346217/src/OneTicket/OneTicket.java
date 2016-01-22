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
public class OneTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入門票代碼: ");
        int code = input.nextInt();
        System.out.print("請輸入數量: ");
        int n = input.nextInt();
        int price=0;
        switch(code){
            
            case 1:
                price = 3000*n;
                System.out.print("所購門票總金額: " +price);
                break;
            case 2:
                price = 2500*n;
                System.out.print("所購門票總金額: " +price);
                break;
            case 3:
                price = 2000*n;
                System.out.print("所購門票總金額: " +price);
                break;
            case 4:
                price = 1000*n;
                System.out.print("所購門票總金額: " +price);;
                break;
            case 5:
                price = 500*n;
                System.out.print("所購門票總金額: " +price);
                break;
                
        }
    }
}
