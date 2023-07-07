public class _3_difference_between_primitive_and_reference_data_type {
    //Difference between primitive and reference data types
public static void main(String[] args){
    //primitive data type
    // pri
    int a = 10;
    int b = a;
    a = 100;
    System.out.println(a);
    System.out.println(b);
// a=100 and b=10 i.e b remain unchanged because of tge memory location

 // reference data type
  person alex = new person("alex");
  person meriam = alex;
  meriam.name = "mariam";
    System.out.println(alex.name);
    System.out.println(meriam.name);
// alex=alex, mariam=alex change because it referenced the value of alex, so if you change the value of alex mariam will
// also change,when you say mariam.name="mariam alex will also be mariam
}

static class person{
    String name;
    person(String name){
        this.name = name;
    }
}

}

