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
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int a, b;
        int total = 0;
        System.out.println("請輸入門票代碼:");
        a = scanner.nextInt();
        System.out.println("請輸入門票數量:");
        b = scanner.nextInt();

        switch (a) {
            case 1:
                total = b * 3000;
                System.out.printf("金額為:%d \n", total);
                break;
            case 2:
                total = b * 2500;
                System.out.printf("金額為:%d \n", total);
                break;
            case 3:
                total = b * 2000;
                System.out.printf("金額為:%d \n", total);
                break;
            case 4:
                total = b * 1000;
                System.out.printf("金額為:%d \n", total);
                break;
            case 5:
                total = b * 500;
                System.out.printf("金額為:%d \n", total);
                break;

        }
    }

}
