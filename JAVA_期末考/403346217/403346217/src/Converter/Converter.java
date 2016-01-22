/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
/**
 *
 * @author user
 */
public class Converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double P=0;
        System.out.print("Kilogram: ");
        double K = input.nextInt();
        P = 2.20462* K*100/100;
        System.out.printf("\nPound:%.2f ", P);
    }
    
}
