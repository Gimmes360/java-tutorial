import java.time.LocalDate;
import java.util.Scanner;

public class _21_Scanner_Class {
    public  static void  main(String[] args){


        //Scanner example 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        // scanner example 2
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

        if (age>=18){
            System.out.println("And you are an adult hooray😁");
        }else {
            System.out.println("And you are not an adult opps😒");
        }



    }
}
