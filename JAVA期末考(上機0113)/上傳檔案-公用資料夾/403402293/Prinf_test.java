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
public class Prinf_test {

    private static int count;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[8];

        System.out.println("please insert 8 number:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            count++;
            if (count == 4) {
                System.out.println();
                count = 0;
            }
        }
        // TODO code application logic here
    }

}
