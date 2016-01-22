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
public class Converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please insert KG =");
        double num=input.nextDouble();
        num=num*2.20462;
        System.out.printf("%.2f",num);
        // TODO code application logic here
    }
    
}
