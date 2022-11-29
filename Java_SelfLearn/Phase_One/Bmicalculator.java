import java.util.Scanner;
public class Bmicalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        Double weight = sc.nextDouble();
        System.out.print("Enter your height: ");
        Double height = sc.nextDouble();
        //cm to m
        Double height2 = height/100;
        //bmi 
        Double bmi = weight / (height2 * height2);
        //System.out.println(height2);
        //System.out.println(weight);
        System.out.println(bmi);
    }
}
