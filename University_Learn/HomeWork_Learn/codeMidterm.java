import java.util.Scanner;
public class codeMidterm {
    public static void main(String[] args) {
        System.out.print("Input number of rows : ");
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int number = 1;
        for(int i = 1; i <= x; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
