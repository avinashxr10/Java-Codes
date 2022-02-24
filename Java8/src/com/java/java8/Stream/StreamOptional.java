package com.java.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class StreamOptional {
    public static void main(String[] args) throws RuntimeException{
        List<String> flats = Arrays.asList("B01", "B08", "B11", "T01", "B01", "B05", "B01", "B05", "T07");
        Optional<String> result = flats.stream().filter(flat -> flat.startsWith("B")).findFirst();
       /* if (result.isPresent()){
            System.out.println(result.get());
        }else {
            System.out.println("no result found");
        } */

        // OR
        result.ifPresent(data->System.out.println(data));

        //OR
        result.ifPresent(System.out::println);

        //else part
        System.out.println(result.orElse("no result found"));
        String output = result.orElseGet(() -> "no data");
        System.out.println(output);
        result.orElseThrow(RuntimeException::new);

        Optional<String> opt1 = Optional.of("Java is Awesome");
        System.out.println(opt1); //Optional[Java is Awesome]
        System.out.println(opt1.get()); //Java is Awesome

        String name= null;
        Optional<String> opt2 = Optional.ofNullable(name); //return existing value
        System.out.println(opt2); //Optional.empty


        String name1= "Hello";
        Optional<String> opt3 = Optional.ofNullable(name1); //return empty for null value
        System.out.println(opt3); //Optional[Hello]


    }
}
