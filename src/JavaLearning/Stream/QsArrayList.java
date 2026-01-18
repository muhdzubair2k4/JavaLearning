package JavaLearning.Stream;

import java.util.ArrayList;
import java.util.Arrays;

public class QsArrayList {
    public static void main(String[] args) {

        ArrayList<String> Country = new ArrayList<>();
        Country.add("Pakistan");
        Country.add("India");
        Country.add("Phillipines");
        Country.add("Canada");
        Country.add("Portugal");

        System.out.println(Country);

//        for(String country : Country) {
//            if (!country.startsWith("P")) {
//                continue;
//            }
//            System.out.println(country);
//        }

        System.out.println(Arrays.toString(Country.stream().filter(x -> x.startsWith("P")).toArray()));




//        Country.stream()
//                .filter(country -> country.startsWith("P"))
//                .map(String::toUpperCase)
//                .forEach(System.out::println);

    }
}
