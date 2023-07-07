import java.time.LocalDate;

public class _2_Reference_data_type {
    public static void main(String[] args){
        //Non-primitive data types or Reference data types
        // Non-primitive data types always starts with capital letter
        String name = new String("Gimmes");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());


    }
}
