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
public class ElectionJava {

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
            System.out.printf("中華民國總統大選");
            System.out.printf("\n(1)朱阿倫\n(2)蔡阿英\n(3)宋阿漁\n");
            int enter = input.nextInt();
            switch(enter){
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
                    
                case 4:
                    d++;
                    count--;
                default:
                    System.out.println("目前你還有0張選票");
                    
            }
            if (count == 0){
                System.out.printf("大選統計系統");
                System.out.printf("(1)朱阿倫 %2d \n(2)蔡阿英 %2d \n(3)宋阿漁");
            }
        }
    }
    
}
