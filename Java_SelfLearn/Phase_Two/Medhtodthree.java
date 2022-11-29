import java.util.Scanner;
public class Medhtodthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int firstnumber = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Second number: ");
        int secondnumber = sc1.nextInt();
        plus(firstnumber, secondnumber);
    }
    static void plus(int firstnumber ,int secondnumber){
        int a = firstnumber;
        int b = secondnumber;
        int c1 = a + b;
        int c2 = a - b;
        int c3 = a * b;
        int c4 = a / b;
        System.out.println("The sum of the two numbers is: " + c1);
        System.out.println("The difference of the two numbers is: " + c2);
        System.out.println("The product of the two numbers is: " + c3);
        System.out.println("The quotient of the two numbers is: " + c4);
    }
}
