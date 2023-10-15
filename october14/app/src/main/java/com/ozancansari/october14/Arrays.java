package com.ozancansari.october14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {


    //Array
    public static void main(String[] args) {


        String[] myStringArray = new String[3];
        myStringArray[0] = "Edin";
         myStringArray [1] = "Dusan" ;
        myStringArray [2] = "Sebastian";

        System.out.println(myStringArray[1]);
        int[] myIntegerArray = new int[3];
       myIntegerArray[0] = 50;
       myIntegerArray[1] = 40;
        myIntegerArray[2] = 60;

        System.out.println(myIntegerArray[1]);



    //List

       ArrayList<String> myMusicians = new ArrayList<String>();
        myMusicians.add("james");
       myMusicians.add("lars");

        System.out.println(myMusicians.get(1));



        //Set

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("james");
        mySet.add("james");


        System.out.println(mySet.size());

      //HashMap

        HashMap<String , String> myHashMap = new HashMap<String ,String >();

         myHashMap.put("name", "james");
         myHashMap.put("instrument", "guitar");


        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

       HashMap<String , Integer > mySecondMap = new HashMap<>();
        mySecondMap.put("run",100);
        mySecondMap.put("basket",00);
        System.out.println(mySecondMap.get("run"));

        //







    }

}
