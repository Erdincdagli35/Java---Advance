package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Collection Example");
        System.out.println("------------------------");

        System.out.println("List");
        List<String> countryList = new ArrayList<>();

        //Adding elements
        countryList.add("Turkey");
        countryList.add("Slovenia");
        countryList.add("France");
        countryList.add("Hungary");
        countryList.add("Belgium");

        //Cool print methods
        //countryList.forEach((c)-> System.out.println(c));
        countryList.forEach(System.out::println);

        //Removing elements
        System.out.println("---Removing element---");
//        countryList.remove(4);
        countryList.remove("Belgium");
        countryList.forEach((c)-> System.out.println(c));

        //Sorting
        System.out.println("---Sorting element--- :: naturalOrder()");
        countryList.sort(Comparator.naturalOrder());
        countryList.forEach(System.out::println);
        System.out.println("---Sorting element--- :: reverseOrder()");
        countryList.sort(Comparator.reverseOrder());
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

        //Adding elements
        city.put(35,"İzmir");
        city.put(34,"İstanbul");

        //Print
        System.out.println(city);

        System.out.println("------------------------");
        System.out.println("LinkedHashMap");
        Map<String,String> person = new LinkedHashMap<String,String>();

        //Adding elements
        person.put("Erdinç","Dağlı");
        person.put("Emre","Dağlı");
        person.put("Beyza","Çiftçioğlu");

        //Print
        System.out.println(person);

        //Removing element
        person.remove("Emre","Dağlı");
        person.put("Dilara","Hazır");
        System.out.println(person);

        System.out.println("------------------------");
        System.out.println("TreeMap");
        Map<String,Integer> birthday = new TreeMap<String,Integer>();

        //Adding elements
        birthday.put("March",1996);
        birthday.put("March",1999);

        //Print
        System.out.println(person);

        /**
         *                            HashMap vs HashTable
         * Synchronized                  -         +
         * Null Value                    +         -
         *
         * Performance                Faster     Slower
         */

        /**
         *                            HashMap vs LinkedHashMap vs TreeMap
         * Null Value                    +           +               -
         * Comparison of elements      equals()    equals()       compareTo()
         *
         * get()                        O(1)        O(1)            log(n)
         * put()                        O(1)        O(1)            log(n)
         *
         * Performance                Faster     Faster            Slower
         */


    }
}
