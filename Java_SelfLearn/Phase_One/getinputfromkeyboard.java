import java.util.Scanner;
public class getinputfromkeyboard {
    public static void main(String[] args) {
        //get input from keyboard
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        //input string from keyboard to variable name 
        String name = sc.nextLine();
//////////////////////////////////////////////////////////////////////////////////
        //get input from keyboard
        System.out.print("Enter your year born: ");
        //input int from keyboard to variable age
        int age = sc.nextInt();
        int year = 2022 - age;
        System.out.print("Hello " + name + "!!!!  ");
        System.out.println("You are " + year + " years old");
//////////////////////////////////////////////////////////////////////////////////
        //get input float from keyboard
        System.out.print("Enter your height: ");
        //input float from keyboard to variable height
        float height = sc.nextFloat();
        System.out.println("Your height is " + height + " m");
//////////////////////////////////////////////////////////////////////////////////
        //get input boolean from keyboard
        System.out.print("Enter your boolean isMarried: ");
        //input boolean from keyboard to variable isMarried
        boolean isMarried = sc.nextBoolean();
        System.out.println("Your is Married is " + isMarried);
//////////////////////////////////////////////////////////////////////////////////
        //get input char from keyboard
        System.out.print("Enter your char : ");
        //input char from keyboard to variable c
        char c = sc.next().charAt(0);
        System.out.println("Your c is " + c);
//////////////////////////////////////////////////////////////////////////////////


    }
}
