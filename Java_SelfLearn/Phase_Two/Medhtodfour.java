import java.util.Scanner;
public class Medhtodfour{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Saraly : ");
        Double salary = sc.nextDouble();
        System.out.println("Your Salary is : " + salary);
        Double bonus = getbonus();
        salary = salary + bonus;
        System.out.println("Your Salary + bonus is : " + salary);
                    
    } 
        
    static Double getbonus(){
        return 5000.0;
    }
}