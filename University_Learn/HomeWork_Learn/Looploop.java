import java.util.Scanner;
public class Looploop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        int sumofnumber = 0;
        int digit = 0;
        int resersenumber = 0;
        while (number != 0){
            digit = number % 10;                                                       
            number /= 10;             
            resersenumber =  resersenumber*10+digit      ;             
            sumofnumber += digit;                                   
        }
       
        System.out.println(sumofnumber);
        System.out.println(resersenumber);

    }
}