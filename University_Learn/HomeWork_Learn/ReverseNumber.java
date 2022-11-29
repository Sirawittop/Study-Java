import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
            Scanner imorrtsc = new Scanner(System.in);
            System.out.print("Enter your Four numbers: ");
            int number = imorrtsc.nextInt();
            int digis = number % 10;
            int two_digis = number % 100 / 10;
            int three_digis = number % 1000 / 100;
            int four_digis = number % 10000 / 1000;
            System.out.println("Reverse Numbers = "+digis +""+ two_digis +""+ three_digis +""+ four_digis);
            System.out.println(number % 10);
    }
}