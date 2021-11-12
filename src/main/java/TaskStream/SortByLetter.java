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
        System.out.println("Страны написаные с маленькой буквы");
         country.forEach(System.out::println);
        System.out.println();
        List<String> COUNTRY = listCountry.stream()
                .filter(n -> n.equals(n.toUpperCase()))
                .collect(Collectors.toList());
        System.out.println("Страны написаные большими буквами");
         COUNTRY.forEach(System.out::println);
        System.out.println();
        List<String> Country = listCountry.stream()
                .filter(n -> (String.valueOf(n.charAt(0))).equals(String.valueOf(n.charAt(0)).toUpperCase()))
                .filter(n -> (String.valueOf(n.charAt(1))).equals(String.valueOf(n.charAt(1)).toLowerCase()))
                .collect(Collectors.toList());
        System.out.println("Страны написаныйе с большой буквы");
        Country.forEach(System.out::println);


    }
}
