package com.learning.core.day3session1andsession2.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Phone {
    public static void main(String[] args){
        HashMap<String,Integer> phoneBook = new HashMap<String, Integer>();
        phoneBook.put("Amal",998787823);
        phoneBook.put("Manvitha",937843978);
        phoneBook.put("Joseph",788222111);
        phoneBook.put("Smith",829389331);
        phoneBook.put("Kathe",723456001);

        for (Map.Entry<String,Integer> entry : phoneBook.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        if (phoneBook.containsKey("Joseph")){
            System.out.println(phoneBook.get("Joseph"));
        }
        else
            System.out.println("no Details Found");

    }
}
