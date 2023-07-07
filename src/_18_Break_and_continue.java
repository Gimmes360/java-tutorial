public class _18_Break_and_continue {
    public  static void  main(String[] args){
        // Break And Continue Statement

        // break
        String [] names = {"david","Anna","Ali","musa"};
        for (String name : names) {
            if (name.equals("Ali")) {
                break;
            }
            System.out.println(name);
        }

        // continue
        String [] myName = {"david","Anna","Ali","musa"};
        for (String name : myName) {
            if (name.equals("david")) {
                continue;
            }
            System.out.println(name);
        }
    }
}
