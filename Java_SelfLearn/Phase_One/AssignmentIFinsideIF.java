import java.util.Scanner;
public class AssignmentIFinsideIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numberone = sc.nextInt();
        System.out.print("Enter second number: ");
        int numbertwo = sc.nextInt();
        System.out.print("Enter third number: ");
        int numberthree = sc.nextInt();

        if (numberone > numbertwo) {
            if (numberone > numberthree) {
                System.out.println("The largest number is " + numberone);
            } else {
                System.out.println("The largest number is " + numberthree);
            }
        } else if (numbertwo > numberthree) {
            System.out.println("The largest number is " + numbertwo);
        } else if(numberthree > numbertwo) {    
            System.out.println("The largest number is " + numberthree);
        }
    }
}
