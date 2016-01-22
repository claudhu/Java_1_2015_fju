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
public class Oneticket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        System.out.println("請輸入您要購買的門票代碼:");
        int f = input.nextInt();
        System.out.println("請輸入您要購買的數量:");
        int num = input.nextInt();
        int $;
        switch (f) {
            case 1:
                $ = 3000 * num;
                System.out.println("總金額:" + $);
                break;
            case 2:
                $ = 2500 * num;
                System.out.println("總金額:" + $);
                break;
            case 3:
                $ = 2000 * num;
                System.out.println("總金額:" + $);
                break;
            case 4:
                $ = 1000 * num;
                System.out.println("總金額:" + $);
                break;
            case 5:
                $ = 500 * num;
                System.out.println("總金額:" + $);
                break;
            default :
                System.out.println("錯誤!");
        }

    }

}
