import java.util.Scanner;
public class Medthodtwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your nickname: ");
        String name = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your firstname : ");
        String firstname = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your lastname : ");
        String lastname = sc2.nextLine();
        display(name); 
        fullname(firstname, lastname);

    }
    static void display(String name){ // name is a parameter
        System.out.println("Hello : "+ name);
    }
    static void fullname(String firstname, String lastname){ // firstname and lastname are parameters
        System.out.println("Your full name is : "+firstname+" "+lastname);
    }

}
