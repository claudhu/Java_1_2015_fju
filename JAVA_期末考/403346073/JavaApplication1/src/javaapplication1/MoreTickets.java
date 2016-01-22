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
public class MoreTickets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int a, b, i;
        int total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;
        System.out.println("請輸入門票代碼:");
        a = scanner.nextInt();
         System.out.println("請輸入門票張數:");
        b = scanner.nextInt();
        if (a==0)
        {
                 System.out.printf("總金額為:%d", total1 + total2 + total3 + total4 + total5);
                
        }

        switch (a) {
            case 1:
                total1 = b * 3000;
               
                System.out.printf("金額為:%d", total1);
                a = 1;
                break;
            case 2:
                total2 = b * 2500;
                System.out.printf("金額為:%d", total1);
                a = 1;
                break;
            case 3:
                total3 = b * 2000;
                System.out.printf("金額為:%d", total1);
                a= 1;
                break;
            case 4:
                total4 = b * 1000;
                System.out.printf("金額為:%d", total1);
                a = 1;
                break;
            case 5:
                total5 = b * 500;
                System.out.printf("金額為:%d", total1);
                a = 1;
                break;
        }
    }
}
