package TaskStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLetter {
    public static void main(String[] args) {
        List<String> listCountry = Arrays.asList("USA", "Belarus", "russia", "UK");

        List<String> country = listCountry.stream()
                .filter(n -> n.equals(n.toLowerCase()))
                .collect(Collectors.toList());
        // country.forEach(System.out::println);
        List<String> COUNTRY = listCountry.stream()
                .filter(n -> n.equals(n.toUpperCase()))
                .collect(Collectors.toList());
        // COUNTRY.forEach(System.out::println);
        List<String> Country = listCountry.stream().
                filter(n -> (String.valueOf(n.charAt(0))).equals(n.toUpperCase()))
                .collect(Collectors.toList());

        System.out.println(Country.isEmpty());
        Country.forEach(System.out::println);
        //  String name = "NAme";
        //   System.out.println(String.valueOf(name.charAt(0)));

    }
}
