//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class TemperatureConverter {

    static String unit;
    static int value;
    static int convertedTemperature;

    public static void main(String[] args) {
        Scanner loud = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        int choice = loud.nextInt();
        if (choice == 1) {
            unit = "Celsius";
            System.out.println(unit);

        } else if (choice == 2) {
            unit = "Fahrenheit";
            System.out.println(unit);
        }
        Scanner bow = new Scanner(System.in);
        System.out.println("Input your value");
        value = bow.nextInt();

        if(unit=="Celsius") {
            convertedTemperature = (value * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit is " + convertedTemperature);
        }
        else if(unit=="Fahrenheit") {
            convertedTemperature=(value - 32) * 5/9;
            System.out.println("Temperature in Celsius is" + convertedTemperature);
        }

    }
}
