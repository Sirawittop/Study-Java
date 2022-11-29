import java.util.Scanner;
public class Looploop3 {
    public static void main(String[] args) {
        System.out.print("Enter your factorial : ");
        Scanner sc = new Scanner(System.in);
        int sumofround = sc.nextInt();
        int sumofnumber = 1;
        for (int i = 1;i<=sumofround;i++){
            sumofnumber *= i;
        }
        if (sumofround == 0){
            System.out.println("sum of factorial  = 0");
        }else {
            System.out.println("sum of factorial = "+ sumofnumber);
        }
    }
}
