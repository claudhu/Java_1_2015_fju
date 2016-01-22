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
public class Sortnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the three numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int[] pub1 = {a, b, c};
        int temp; 
        System.out.println("The sorting result is as follows:");
        for (int i = 0; i < pub1.length - 1; i++) {
            for (int j = i + 1; j < pub1.length; j++) {
                if (pub1[i] > pub1[j]) {
                    temp = pub1[i];
                    pub1[i] = pub1[j];
                    pub1[j] = temp;
                }
            }
           
        }
        for (int k = 0; k < pub1.length; k++) {

            System.out.printf("%3d", pub1[k]);
        }
    }

}
