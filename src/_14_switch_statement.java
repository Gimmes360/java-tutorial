public class _14_switch_statement {
  public   static  void main(String[] args){
      // switch statement
      String gender = "Female";
      switch (gender.toUpperCase()){
          case "FEMALE":
              System.out.println("i am female");
              break;
          case "MALE":
              System.out.println("i am a male");
              break;
          default:
              System.out.println("unknown gender");
      }
  }
}
