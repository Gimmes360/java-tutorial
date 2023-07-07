public class _12_if_statement {
    public static void main (String[] args){
        //if statement
        int age =18;
        if (age >= 18){
            System.out.println("i am an adult");
        }
        // if else statement
        int myAge = 17;
        if(myAge >= 18){
            System.out.println("Hooray.. i am an adult");
        }else {
            System.out.println("oppss i am not an adult");
        }

        // else if statement
        int number =1 ;
        if (number==1){
            System.out.println("one");
        } else if (number==2) {
            System.out.println("Two");
        } else if (number==3) {
            System.out.println("Three");
        }else {
            System.out.println("number out of range");
        }

    }
}
