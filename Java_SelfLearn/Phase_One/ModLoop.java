import java.util.Scanner;
public class ModLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter number : ");
            int input = sc.nextInt(); 
            if (input < 0){
                break;}
            if (input % 2 == 0){
                System.out.println("Even number");
            }
            else{
                System.out.println("Odd number");
            }
        }
    }
}
