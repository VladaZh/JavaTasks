package secondTask;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SecondTask {
    static double DOLLAR = 83.99;
    static double YUAN = 11.72;
    static double EURO = 98.6;
    static double DIRHAM = 22.87;
    static double POUND = 113.6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            double rubles = scanner.nextDouble();
            System.out.println("Рубли: " + rubles);
            System.out.printf("В долларах: %.2f\n", rubles / DOLLAR);
            System.out.printf("В юанях: %.2f\n", rubles / YUAN);
            System.out.printf("В евро: %.2f\n", rubles / EURO);
            System.out.printf("В дирхамах: %.2f\n", rubles / DIRHAM);
            System.out.printf("В фунтах стерлингов: %.2f\n", rubles / POUND);
            scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("Ошибка! Введите число");
        }
    }
}
