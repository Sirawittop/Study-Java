import java.util.Scanner;
public class MultipyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int startnum = sc.nextInt();
        System.out.print("Enter number for mul: ");
        int stopnum = sc.nextInt();
        
        for(int m  = startnum; m <= stopnum; m++){
            for(int x = 1 ; x < 13; x++){
                System.out.print(m + " * " + x);
                System.out.println(" = " + m * x);
            }
            System.out.println("---------------------");
        }
    }
}
