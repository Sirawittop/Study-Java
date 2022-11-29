import java.util.Scanner;
public class SumotionEx {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number " +num + " : ");
            int input = sc.nextInt(); 
            if (input == 0){
                break;}
            sum += input; // sum of number 1 to 5
            num++;

        }
        int average = sum / (num-1); // average of number 1 to 5
        System.out.println("--------------------------------");
        System.out.println("sum of  number = "+sum);
        System.out.println("average of five number = "+average);
        System.out.println("--------------------------------");

    }
}
