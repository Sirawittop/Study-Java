import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter loop : ");
        int loop = sc.nextInt();
        //////////////////////////////////////////// solution while loop
        int a = 0;
        while(a <= loop){
            System.out.print(a);
            System.out.println(" Hello");
            a++;
        }

        //////////////////////////////////////////// solution while true and break
        int b = 0;
        while(true){
            if(b == 100) break;
            
            System.out.print(b);
            System.out.println(" Hello");
            b++;
        }
    }
}
