import java.util.Scanner;
public class Exchangebanknotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your money to Exchange: ");
        int money = sc.nextInt();
        System.out.println(money);
        if (money >= 1000) {
            int b1000 = money / 1000;
            money %= 1000;
            System.out.println("bank 1000 = " + b1000 + " banknotes");
        }if (money >= 500) {
            int b500 = money / 500;
            money %= 500;
            System.out.println("bank 500 = " + b500 + " banknotes");
        }if (money >= 100) {
            int b100 = money / 100;
            money %= 100;
            System.out.println("bank 100 = " + b100+ " banknotes");
        }if (money >= 50) {
            int b50 = money / 50;
            money %= 50;
            System.out.println("bank 50 = " + b50 + " banknotes");
        }if (money >= 20){
            int b20 = money / 20;
            money %= 20;
            System.out.println("bank 20 = " + b20 + " banknotes");
        }if (money >= 10){
            int b10 = money / 10;
            money %= 10;
            System.out.println("coin 10 = " + b10 + " coin");
        }if (money >= 5){
            int b5 = money / 5;
            money %= 5;
            System.out.println("coin 5 = " + b5 + " coin");
        }if (money >= 2){
            int b2 = money / 2;
            money %= 2;
            System.out.println("coin 2 = " + b2 + " coin");
        }if (money >= 1){
            int b1 = money / 1;
            money %= 1;
            System.out.println("coin 1 = " + b1 + " coin");
        }
    }
}