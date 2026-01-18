package JavaLearning.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PriceAnalysis {
    public static void main(String[] args) {

        ArrayList<Integer> Price = new ArrayList<>();
        Price.add(500);
        Price.add(1500);
        Price.add(1000);
        Price.add(800);
        Price.add(1200);


        System.out.println(Price);


        List<Integer> processedPrices = Price.stream()
                .filter(price -> price > 1000)
                .map(price -> price * price)
                .sorted()
                .collect(Collectors.toList());


        System.out.println(processedPrices);
    }
}
