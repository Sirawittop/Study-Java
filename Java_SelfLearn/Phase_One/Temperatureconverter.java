import java.util.Scanner;
public class Temperatureconverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //////////////////////////////////////////// solution fahrenheit to celsius
        System.out.print("Enter your temperature(Fahrenheit Degree): ");
        float temp = sc.nextFloat();
        float fahrenheit = (temp - 32) * 5 / 9;
        System.out.print("Your temperature(Celsius Degree) = " );
        System.out.print(Math.floor( fahrenheit * 100 ) / 100 + " degree");
        //////////////////////////////////////////// solution celsius to fahrenheit
        System.out.print("\nEnter your temperature(Celsius Degree): ");
        float temp2 = sc.nextFloat();
        float celsius = (temp2 * 9 / 5) + 32;
        System.out.print("Your temperature(Fahrenheit Degree) = " );
        System.out.print(Math.floor( celsius * 100 ) / 100 + " degree");
    }
}
