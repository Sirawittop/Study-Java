import java.util.Scanner;
public class Ifstatement_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        if (age < 15){
            System.out.print("So young Mon!!!!");
        }else if (age < 20){
            System.out.print("Kid go to school now!!!!");
        }else if (age < 30){
            System.out.print("so nare dead!!!!");
        }else{
            System.out.print("so old!!!!");
        }
    }
}
