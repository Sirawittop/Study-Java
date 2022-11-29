import java.util.Scanner;
public class MinMaxLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = Integer.MAX_VALUE;
        while(true){
            System.out.print("Enter number : ");
            int input = sc.nextInt(); 
            if (input < 0){
                break;}
            if (input > max){
                max = input;
            }
            if (input < min){
                min = input;
            }
    
        }
        System.out.println("Max number = "+max);
        System.out.println("Min number = "+min);
    }
}
