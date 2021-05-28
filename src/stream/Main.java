package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//user/@Mostafa
public class Main {

    public static void main(String[] args) {

        String path_country="/media/mostafa/New Volume/ITI AI PRO/Java & UML Programming/Day4/CSV_files/Countries.csv";
        String path_city="/media/mostafa/New Volume/ITI AI PRO/Java & UML Programming/Day4/CSV_files/Cities.csv";

        read_data read=new read_data();
        List<country>countries=read.read_country_from_csv(path_country);
        List<city>cities=read.read_city_from_csv(path_city);

        Map<String,List<city>> map_cities=new HashMap<>();
        for(city c:cities){
            List<city>filtered_cities=cities.stream().filter(s->s.getCountryCode().equals(c.getCountryCode())).collect(Collectors.toList());
            map_cities.put(c.getCountryCode(),filtered_cities);
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter CountryCode:");
        String code=scan.next();
        map_cities.get(code).stream().sorted(Comparator.comparing(city::getPopulation)).forEach(s-> System.out.println(s.getName()+"|"+s.getPopulation()));

        //list of countries population
        List<Double>countries_population=new ArrayList<>();
        for(country c:countries){
            countries_population.add(c.getPopulation());
        }

        System.out.println("Avg.of countries population:"+countries_population.stream().mapToDouble((x)->x).average().getAsDouble());
        System.out.println("Max.of countries population:"+countries_population.stream().mapToDouble((x)->x).max().getAsDouble());

        // Highest population city of each country
        for(country c:countries){
            List<city> cit=map_cities.get(c.getCode()).stream().sorted(Comparator.comparing(city::getPopulation).reversed()).findFirst().stream().collect(Collectors.toList());

            System.out.println("Country Name: "+c.getName());
            cit.stream().forEach(s-> System.out.println("City Name:"+s.getName()));
        }


    }
}
