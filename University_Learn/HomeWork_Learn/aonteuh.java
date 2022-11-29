//64020822 นายสิรวิชญ์ คำชุ่ม
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class aonteuh {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();        
        System.out.println("Now = "+ myObj);
        String sirawit = myObj.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        System.out.println(sirawit);
        System.out.println("Day : "+myObj.getDayOfMonth());
        System.out.println("Month : "+myObj.getMonthValue());
        System.out.println("Year : "+myObj.getYear());
    }
}
