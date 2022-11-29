import java.util.Scanner;
class ConvertCEtoBe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Porsor: ");
        int numberofyear = sc.nextInt();
        int numberofyearCE = numberofyear - 543;
        System.out.println(numberofyearCE);
    }
}