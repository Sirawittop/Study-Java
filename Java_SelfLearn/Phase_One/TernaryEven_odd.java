import java.util.Scanner;
public class TernaryEven_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        /////////////////////////////////////////////////////////////////////////////// solution 1
        String sum = number % 2 == 0 ? number + "  Even" : number + "  Odd";
        System.out.println(sum);
        /////////////////////////////////////////////////////////////////////////////// solution 2
        sum = number % 2 == 0 ? number + "  Even" : number + "  Odd";
        System.out.println(sum);
    }
        // variable = condition ? true : false;
        // (sum) = (number % 2 == 0) ? (number + "  Even") : (number + "  Odd");
}
