package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("London");
        cityList.add("Denver");

        System.out.println("List size :" + cityList.size());
        System.out.println("Is Miami in the list ? " + cityList.contains("Miami"));
        System.out.println("Index of Denver in the list ? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty : " + cityList.isEmpty());
    }
}
