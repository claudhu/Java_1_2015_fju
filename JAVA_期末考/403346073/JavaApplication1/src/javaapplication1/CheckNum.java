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
public class CheckNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int d1, d2;
        System.out.printf("Please enter 9 digits:");
        d1 = scanner.nextInt();
        System.out.printf("The check is:");
        d2 = scanner.nextInt();
        System.out.printf("The ISBM is:%d%d", d1, d2);

        /*if ((d1*1)+(d2*2)+(d3*3)+(d4*4)+(d5*5)+(d6*6)+(d7*7)+(d8*8)+(d9*9)%11==10)
         {*/
    }
}
