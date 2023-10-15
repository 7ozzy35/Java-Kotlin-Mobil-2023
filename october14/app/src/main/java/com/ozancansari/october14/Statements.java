package com.ozancansari.october14;

public class Statements {

    public static void main(String[] args) {

        //operators

        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);


        //if statements


        x = 5;
        int y = 4;
        int z = 15;
        if ( x < y){
            System.out.println("y is bigger"); }
        else  if ( y < x){
            System.out.println("x is bigger");
            }
        else  if ( y == x){
            System.out.println("x equal y");
        }


        //Switch Statements

        int day = 1;
        String dayString = "";

        switch (day){
            case 1:
                dayString ="Monday";
                break;
            case 2:
                dayString ="Tuesday";
                break;
            case 3:
                dayString ="Wednesday";
                break;
            case 4:
                dayString ="Thursday";
                break;
            case 5:
                dayString ="Friday";
                break;
            case 6:
                dayString ="Saturday";
                break;
            default:
                dayString ="Sunday";
                break;  }
        System.out.println(dayString);







        }

    }

