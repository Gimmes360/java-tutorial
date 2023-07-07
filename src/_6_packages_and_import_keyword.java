import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class _6_packages_and_import_keyword {
    public static void main (String[] args){
        //ANYTHING FROM JAVA.LANG HAS NO IMPORT STATEMENT e.g String n = "name";
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

    }
}
