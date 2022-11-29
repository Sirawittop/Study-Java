import java.util.Scanner;
public class Compairtutorial {
    public static void main(String[] args) {
        //compare true or false
        //get two numbers input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        //////////////////////////////////////////// solution 1
        boolean result = a > b;
        boolean result2 = a < b;
        System.out.println("a > b = " + result);
        System.out.println("a < b = " + result2);
        //////////////////////////////////////////// solution 2
        System.out.println("a == b: "+(a==b));
        System.out.println("a != b: "+(a!=b));
        System.out.println("a > b: "+(a>b));
        System.out.println("a < b: "+(a<b));
        System.out.println("a >= b: "+(a>=b));
        System.out.println("a <= b: "+(a<=b));
    }
}
