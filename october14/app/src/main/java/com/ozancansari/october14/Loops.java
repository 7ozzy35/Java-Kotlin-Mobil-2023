package com.ozancansari.october14;

public class Loops {
    public static void main(String[] args) {
        /*for loops*/

        int[] myNumbers = {35,21,63,47};

                 // System.out.println(x);

        for (int i = 0 ; i < myNumbers.length; i++) {
            int x = myNumbers[i] / 3 * 5;
            // System.out.println(x);
            }
        for (int number : myNumbers) {
        //    System.out.println(number);
        }
        for (int a = 0 ; a < 10 ; a++){
            int b = a * 10;
            // System.out.println(b);
        }


        /*while */

        int j = 0 ;
        while (j < 10){
            System.out.println("test");
        j++;
        }







    }
}
