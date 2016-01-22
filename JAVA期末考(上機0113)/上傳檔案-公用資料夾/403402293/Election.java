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
public class Election {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int count = 10;
        for (;;) {
            System.out.printf("中華民國總統大選,請輸入你的投票選擇,目前你還有%d票\n", count);
            System.out.printf("(一)朱阿倫\n(二)蔡阿英\n（三）宋阿漁\n（四）廢票");
            int enter = input.nextInt();
            switch (enter) {
                case 1:
                    a++;
                    count--;
                    break;
                case 2:
                    b++;
                    count--;
                    break;
                case 3:
                    c++;
                    count--;
                    break;
                case 4:
                    d++;
                    count--;
                default:
                    System.out.printf("請重新投票\n");
            }
            if (count == 0) {
                System.out.printf("大選結果統計:\n");
                System.out.printf("(一)朱阿倫%2d票\n(二)蔡阿英%2d票\n(三)宋阿漁%2d票\n(四)廢票%2d票\n",a,b,c,d);
                break;
            }
        }
    }
}

