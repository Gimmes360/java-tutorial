public class _1_primitive_data_type {
    public static void main (String[] args){
        //The primitive data types
      byte theByte = 124; // 1 byte -128 to 127
      short theShort = 3265; // 2 byte -32,768 t0 32,767
        int theInt = 65422987; // 4 byte -2147,483,648 to 2147,483,647
        long theLong = 897865564; // 8 byte
        float theFloat = 0.97655F; // 4 byte stores fractional numbers from 6-7 decimal digits
        double theDouble = 90.887765; // 8 byte stores fractional numbers up to 15 decimal
        boolean theBoolean = true; // 1 bit stores true or false
        char theChar = 'A'; // 2 byte stores single character/letter/ASCII value within a single quote

      //printing out the values, sout shortcut to print
        System.out.println(theByte);
        System.out.println(theShort);
      System.out.println(theInt);
      System.out.println(theLong);
      System.out.println(theFloat);
      System.out.println(theDouble);
      System.out.println(theBoolean);
      System.out.println(theChar);


    }
}
