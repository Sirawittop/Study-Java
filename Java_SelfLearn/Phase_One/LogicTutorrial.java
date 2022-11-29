import javax.print.attribute.standard.MediaName;

public class Logictutorrial {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        //////////////////////////////////////////// solution 1 of and
        boolean c = a == b;
        boolean d = a < b;
        System.out.println(c && d);
        //////////////////////////////////////////// solution 2 of and
        System.out.println((a == b) && (a < b));
        //////////////////////////////////////////// Logic or
        System.out.println((a == b) || (a < b));
        //////////////////////////////////////////// Logic not
        System.out.println(!(a == b));

    }
}
