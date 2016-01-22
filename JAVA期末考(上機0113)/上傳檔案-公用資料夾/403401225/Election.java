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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int count = 10;
        
        for(;;){
            System.out.println("中國民總統大選，請輸入你的投票選擇，您還有"+count+"票");
            System.out.println("1.朱阿倫 2.蔡阿文 3.宋阿魚 4.廢票");
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
                break;
            default:
                System.out.println("錯誤!");
                break;
        }
        if (count == 0) {
            System.out.println("大選結統計:");
            System.out.println("(一) 朱阿倫"+a+"票");
            System.out.println("(二) 蔡阿文"+b+ "票");
            System.out.println("三) 宋阿魚"+c+"票");
            System.out.println("(四) 廢票"+d+"票");
            break;
        }

    }
}}
