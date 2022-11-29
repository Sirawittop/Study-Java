import java.util.Scanner;
public class grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score : ");
        int numberofscore = sc.nextInt();
        if ((numberofscore <= 100)&&(numberofscore >= 0) ){
            if(numberofscore >= 80){
                System.out.println("Grade A");
            }else if (numberofscore >= 75){
                System.out.println("Grade B+");
            }else if (numberofscore >= 70){
                System.out.println("Grade B");
            }else if (numberofscore >= 65){
                System.out.println("Grade C+");
            }else if (numberofscore >= 60){
                System.out.println("Grade C");
            }else{
                System.out.println("Grade F");
            }
        }else{
            System.out.println("Incorrect information");
        }
     }

}