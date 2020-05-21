import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One","Two","Three");
        System.out.println(list);

        System.out.println("*********Print every String in Upper Case************");
        list.stream().map((value)->{ return value.toUpperCase();})
                .map((value)-> {return value.substring(0,3); })
                .forEach(s-> System.out.println(s));

        System.out.println("*******Get only Length > 3*********");

        list.stream().map(value->{return value.toUpperCase();})
                .filter(value->{return value.length()>3;})
                .forEach(s-> System.out.println(s));

        System.out.println("********Practice this ********");

        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> str = stringList.stream();
        str.flatMap(s -> {
           String[] str2= s.split(" ");
           return Arrays.stream(str2);
        }).forEach(s-> System.out.println(s));

        System.out.println("************Distinct (Removes Duplicate)**************");
//Not working
        List<Integer> list2 = Arrays.asList(1,2,3,2,3,4,5);
        List<Integer> l2= list2;
        l2.stream().filter(l->l2.remove(l));

        //System.out.println(list2);
        System.out.println("************Limit (print first 3 elements)**************");
        list2.stream().limit(3).forEach(l-> System.out.println(l));

        System.out.println("************Peek**************");
        list2.stream().peek(l-> System.out.println(l)).forEach(System.out::println);

        System.out.println("************Reduce**************");
        List<Integer> list3 = Arrays.asList(1,2,495);
        System.out.println(list3);
        //int sum = list3.stream().map(l->l).sorted((a,b)->b.compareTo(a)).reduce(0,(a,b)->a*10+b);

        System.out.println("************Counting the number of elements in the list**************");
        //Count of the elements ini the list
        long count = list.parallelStream().count();
        System.out.println(count);
        
        /*Stream Functions*/
        // map -> this will return the collection
        // forEach -> used for iterations
        // filter -> to give condition like a if-else condition
        // limit -> to provide the range i.e max range from 0 to limit
        // sorter -> get elements sorted
        // parallel processing -> parallelStream
        // Colelctors -> this will return the specfic collection and we can save in the variable
        // 
        
        
        
    }
}
