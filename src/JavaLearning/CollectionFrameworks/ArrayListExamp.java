package JavaLearning.CollectionFrameworks;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListExamp {
    static void addNextLine() {
        System.out.println("");
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Zubair");
        list.add("Ali Raza");
        list.add("Waqar Ahmed");

        //******************** REPLACE ELEMENT FROM INDEX ********************
//        list.set(2, "tariq mehmood");
//        System.out.println(list);


        //******************** ADD ELEMENT BETWEEN INDEXES ********************
//        list.add(2, "Tariq Mahmood");
//        System.out.println(list.size());
//        System.out.println(list);


        //******************** HOW TO PRINT ARRAY LIST ********************
//        for (int i = 0; i< list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//        addNextLine();
//        System.out.println(list);
//
//        addNextLine();
//        for (String List : list) {
//            System.out.println(List);
//        }

        //******************** CHECK EXISTENCE ********************
//        System.out.println(list.contains("Zubair"));
//        System.out.println(list.contains("zubair"));

    }
}
