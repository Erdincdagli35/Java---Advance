package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Collection Example");
        System.out.println("------------------------");

        System.out.println("List");
        List<String> countryList = new ArrayList<>();
        countryList.add("Turkey");
        countryList.add("Slovenia");
        countryList.add("France");
        countryList.add("Hungary");

        //Cool print methods
        //countryList.forEach((c)-> System.out.println(c));
        countryList.forEach(System.out::println);

        /**
         *                          ArrayList vs Linkedlist
         * Constructor()                 +           +
         * Constructor(size)             +           -
         * Adding Member(At Last)        +           +
         * Deque                         -           +
         *
         * Adding an element           O(n)         O(1)
         * Retrieving an element       O(1)         O(n)
         * Removing an element         O(n)         O(1)
         */

        /**
         *                          ArrayList vs Vector
         * Expand the array              x2       %50
         * Constructor(size)             +         +
         * Constructor(size)             +         +
         * Adding Member(At Last)        +         +
         *
         * Performance                Faster     Slower
         */

        System.out.println("------------------------");

        System.out.println("HashMap");
        Map<Integer,String> city = new HashMap<Integer,String>();
        city.put(35,"İzmir");
        city.put(34,"İstanbul");
        System.out.println(city);
    }
}
