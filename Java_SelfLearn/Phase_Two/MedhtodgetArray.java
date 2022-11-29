import java.net.DatagramSocketImplFactory;
import java.util.Scanner; 
public class MedhtodgetArray {
    public static void main(String[] args) {
        int [] numberA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        displayarray(numberA);
        int [] numberB = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
        displayarray(numberB);
        int [] numberC = {100,200,300,400,500,600,700,800,900,1000,1100,1200,1300,1400,1500,1600,1700,1800,1900,2000};
        displayarray(numberC);
        Double [] price = {10.5,20.5,30.5,40.5,50.5,60.5,70.5,80.5,90.5,100.5,110.5,120.5,130.5,140.5,150.5,160.5,170.5,180.5,190.5,200.5};
        displayarraydouble(price);
    }
    static void displayarray(int [] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
    static void displayarraydouble(Double [] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
