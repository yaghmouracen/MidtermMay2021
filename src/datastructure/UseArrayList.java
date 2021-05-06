package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        examArrayList();

    }
    public static void examArrayList (){
        ArrayList<String> listOfCity = new ArrayList<>();
        listOfCity.add("Bejaia");
        listOfCity.add("Sidi Aich");
        listOfCity.add("Chemini");
        listOfCity.add("Akbou1");
        listOfCity.add("Akbou2");
        listOfCity.remove("Akbou2");
        listOfCity.remove(3);
        System.out.println(listOfCity.size());
        System.out.println(listOfCity);
        System.out.println(listOfCity.get(0));


        // 2 nd method
        for (int i = 0; i < listOfCity.size(); i++) {
            System.out.println(listOfCity.get(i));
        }
        // 3rd method
        listOfCity.add("Tazmalt");
        listOfCity.add("Zountar");

        Iterator iterator = listOfCity.iterator();

        // while the iterator has a value print it
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        ArrayList<Integer> zipCode = new ArrayList<>();
        zipCode.add(06042);
        zipCode.add(06000);
        zipCode.add(06040);

        zipCode.clear();
        System.out.println(zipCode);

        ArrayList<Object> everything = new ArrayList<>();
        everything.add("Hi Y'all");
        everything.add(25);
        everything.add(true);


    }


}