import java.util.Scanner;
public class Bmiclass {
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
        System.out.print("Your BMI is ");
        System.out.println(Math.floor( bmi * 100 ) / 100 ); // Math.floor( variable * 100 ) / 100 ) ทำทศนิยม 2 ตำแหน่งไม่ปัดเศษ
        
        
        /////////////////////////////////////////////////////////////////// solution one
        if (bmi < 18){
            System.out.println("You are under the threshold");
        }else if (bmi < 18.5) {
            System.out.println("You are Underweight");
        } else if (bmi < 23) {
            System.out.println("You are Normal");
        } else if (bmi < 25) {
            System.out.println("You are Overweight");
        } else if (bmi < 30) {
            System.out.println("You are Obese");
        }else {
            System.out.println("You are Very Obese");
        }
        /////////////////////////////////////////////////////////////////// solution two
        String result = "";
        System.out.print("Your BMI is ");
        System.out.println(Math.floor( bmi * 100 ) / 100 );
        if(bmi < 18){
            result = "You are under the threshold";
        }else if(bmi < 18.5){
            result = "You are Underweight";
        }else if(bmi < 23){
            result = "You are Normal";
        }else if(bmi < 25){
            result = "You are Overweight";
        }else if(bmi < 30){
            result = "You are Obese";
        }else{
            result = "You are Very Obese";
        }
        System.out.println(result);
    }
}
