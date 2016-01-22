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
public class SortNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the three numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int temp = 0;
        int[] a = {num1,num2,num3};
        for (int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length;j++) {
            
            if (a[i] > a[j]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            }
            
        }
        System.out.println("the sorting result is as follows");
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k]+" ");
        }

    }
    }
    

