import java.util.Scanner;
class AssignmentEven_odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        /////////////////////////////////////////////////////////////////////////////// solution 1
        if (number % 2 == 0) {
            System.out.println(number + "  Even");
        } else {
            System.out.println(number + "  Odd");
        }
        /////////////////////////////////////////////////////////////////////////////// solution 2
        String sum = "";
        if (number % 2 == 0){
            sum = number + "  Even";
        } else {
            sum = number + "  Odd";
        }
        System.out.println(sum);
    }
}