import java.util.Scanner;
public class Looploop4 {
    public static void main(String[] args) {
        System.out.print("Enter length : ");
        Scanner sc1 = new Scanner(System.in);
        int numberone = sc1.nextInt();
        System.out.print("Enter breadth : ");
        Scanner sc2 = new Scanner(System.in);
        int numbertwo =sc2.nextInt();
        if (numberone == numbertwo){
            System.out.println("This is square");
        }else{
            System.out.println("This is not square");
        }
    }
}
