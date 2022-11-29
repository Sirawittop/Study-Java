import java.util.Scanner;
public class Inputnextline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();  //nextLine() method is used to read the next line of input from the user
                                            //next() method is used to read the next character from the user input 
        System.out.println("Hello " + name);
    }

    
}
