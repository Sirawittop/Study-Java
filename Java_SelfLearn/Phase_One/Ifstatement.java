public class Ifstatement {
    public static void main(String[] args) {
        boolean result = 10 > 5 ;
        /////////////////////////////////////////////// solution one
        if (result) {
            System.out.println("10 is greater than 5");
        }
        else {
            System.out.println("10 is not greater than 5");
        }
        /////////////////////////////////////////////// solution two
        if (10 > 5) {
            System.out.println("10 is greater than 5");
        }
        else {
            System.out.println("10 is not greater than 5");
        }
    }
}
