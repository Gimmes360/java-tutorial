public class _23_Classes_and_Object {

    public static void main(String[] args) {

        //object
        Lens lensOne = new Lens("sony",
                "85mm",
                true);

        Lens lensTwo = new Lens("canon",
                "35mm",
                false);
        Lens lensThree = new Lens("LG",
                "105mm",
                true);

        System.out.println("Lens one");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println();

        System.out.println("Lens two");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println();


        System.out.println("Lens three");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);
        System.out.println();
    }


    static class Lens {     //Class
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) { //constructor
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }

    }




}
