import java.util.Scanner;
public class IfinsideIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your AGE: ");
        int age = sc.nextInt();

        if (age <= 15) {
            if(age == 15){
                System.out.println("Junior high school");
                System.out.println("Grade 9");
            }
            else if(age == 14){
                System.out.println("Junior high school");
                System.out.println("Grade 8");
            }
            else if(age == 13){
                System.out.println("Junior high school");
                System.out.println("Grade 7");
            }else{
                System.out.println("Elementary");
            }
        } else {
            System.out.println("High school"); 
        }
    }
}
