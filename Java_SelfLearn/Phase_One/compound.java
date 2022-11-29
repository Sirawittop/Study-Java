public class compound {
    public static void main(String[] args) {
        int  x = 10;
        int  y = 5;
        //////////////////////////////////////////// slution one
        System.out.println("before x = " + x);
        x = x + y;
        System.out.println("after x = " + x);
        //////////////////////////////////////////// slution two
        int x2 = 10;
        int y2 = 5;
        System.out.println("before x = " + x2);
        x2 += y2;
        System.out.println("after x = " + x2);


    }
}
