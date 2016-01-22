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
public class Lottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String lottery =" "+(int)(Math.random()*10);
        System.out.println("請輸入100-999之間的數字:");
        String guess = input.nextLine();
        char guess1 =guess.charAt(0);
        char guess2 =guess.charAt(1);
        char guess3 =guess.charAt(2);
        char lottery1 =guess.charAt(0);
        char lottery2 =guess.charAt(1);
        char lottery3 =guess.charAt(2);
        if(guess1==lottery1&&guess2==lottery2&&guess3==lottery3){
            System.out.println("您獲得獎金:10000元");
        } 
        else if (guess3==lottery3&&guess2==lottery2){
            System.out.println("您獲得獎金:8000元");
        }
        if ((guess3 != lottery1 || guess1 != lottery2)||guess2!=lottery3&&((guess2 != lottery1 || guess3 != lottery2) || guess1 != lottery3)){
            System.out.println("您獲得獎金:6000元");
        }
        else{
            System.out.println("抱歉!");
        }
    }
    
}
