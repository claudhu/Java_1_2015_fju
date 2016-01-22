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
public class SorNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the three number:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a>b && b>c)
        {
            System.out.printf("The sorting result is as follows:%d %d %d \n",c,b,a);
        }
        else if (a>c && c>b)
        {
            System.out.printf("The sorting result is as follows:%d %d %d \n",b,c,a);
        }
        else if (b>a && a>c)
        {
            System.out.printf("The sorting result is as follows:%d %d %d \n",c,a,b);
        }
        else if (b>c && c>a)
        {
            System.out.printf("The sorting result is as follows:%d %d %d \n",a,c,b);
        }
        else if (c>a && a>b)
        {
            System.out.printf("The sorting result is as follows:%d %d %d \n",b,a,c);
        }
        else {
            System.out.printf("The sorting result is as follows:%d %d %d \n",a,b,c);
        }
    }

}
