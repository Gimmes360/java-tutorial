import java.util.Arrays;

public class _15_Arrays {
    public static void main(String[] args){
        // Arrays
        // default for int is 0
        int [] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));

        // default for boolean is false
        boolean [] number = new boolean[3];
        System.out.println(Arrays.toString(number));

        // default for string is null
        String [] words = new String[3];
        System.out.println(Arrays.toString(words));

        // Assigning values to array
        int [] num = new int[3];
        num [0] = 1;
        num [1] = 2;
        num [2] = 3;
        System.out.println(Arrays.toString(num));
        // 0r
        int [] num1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(num1));
        System.out.println(num1.length);
        // or
        String [] name = {"moses","david","papa"} ;
        System.out.println(Arrays.toString(name));
        System.out.println(name.length);
    }
}
