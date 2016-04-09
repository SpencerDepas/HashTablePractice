package com.clearfaun.algorythems;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //all this does is returns some strings to a hashmap
        HashMap map = fillHashMap();



        //create a new list
        List<String> newLinkedList = new LinkedList<>();
        //BIG 0(n)
        for(int i = 0 ; i < map.size(); i ++){

            newLinkedList.add(map.get(i + " ").toString());

            System.out.println(newLinkedList.get(i));
        }

        System.out.println();
        //output of linkedlist
        //17 Fake Street
        //Phoney town
        //Makebelieveland
        //17 Fake Stewewereet
        //Phoney tweewweown
        //ee
        //17 Fakewewe Street
        //Phoney wwtown
        //Makebelwqqqieveland


        //After I googled the Answer
        ArrayList<String> list = new ArrayList<String>(map.values());

        for(int i = 0 ; i < map.size(); i ++){

            System.out.println(list.get(i));
        }

    }


    public static HashMap fillHashMap(){
        List<String> singleAddress = new LinkedList<>();
        singleAddress.add("17 Fake Street");
        singleAddress.add("Phoney town");
        singleAddress.add("Makebelieveland");
        singleAddress.add("17 Fake Stewewereet");
        singleAddress.add("Phoney tweewweown");
        singleAddress.add("ee");
        singleAddress.add("17 Fakewewe Street");
        singleAddress.add("Phoney wwtown");
        singleAddress.add("Makebelwqqqieveland");

        HashMap map = new HashMap();


        for(int i = 0 ; i < singleAddress.size(); i ++){
            map.put((i + " "), singleAddress.get(i));
        }

        return map;
    }


 
}
