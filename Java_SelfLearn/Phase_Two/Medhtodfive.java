import java.util.Scanner;
public class Medhtodfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int numone = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Second number: ");
        int numtwo = sc1.nextInt();
        int result = maxnumber(numone, numtwo);
        int result2 = minnumber(numone, numtwo);
        System.out.println("The Max number is "+result);  
        System.out.println("The Min number is "+result2);  
        System.out.println("Sum of the two numbers is: " + (numone + numtwo));
    }
    static int maxnumber(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    static int minnumber(int a,int b){
        if(a>b){
            return b;
        }
        else{
            return a;
        }
    }
}
