public class _11_Logical_operators {
    public static void main (String[] args){
    boolean isTrue = true;
    boolean isFalse = false;
    boolean isNotTrue = false;
    boolean isNotFalse = true;
                    // AND &&
        System.out.println(isTrue && isFalse);
        System.out.println(isTrue && isNotFalse);
                   // OR ||
        System.out.println(isTrue || isFalse);
        System.out.println(isFalse || isNotTrue);
                  // NOT !
        System.out.println(!isTrue);
        System.out.println(!isFalse);
    }
}
