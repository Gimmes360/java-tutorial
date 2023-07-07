import java.util.Arrays;

public class _22_Methods {

    public static void main(String[] args) { //  main is also a built-in method none as the main method
        //Built in Methods: provided by default in java
        System.out.println(); // .println() is a built-in method
        String brand = "samsung";
        System.out.println(brand.toUpperCase()); // .toUpperCase() is a built-in method

        // user defined methods: created by the user
        char[] letters = {'a','b','c','d','e'};
        int count = countOccurances(letters);
        System.out.println(count);
    }
    public static int countOccurances(
            char [] letters){
        System.out.println(Arrays.toString(letters));
        return -1;
    }



    }
