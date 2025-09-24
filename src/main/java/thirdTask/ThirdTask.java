package thirdTask;

import java.util.Random;
import java.util.Scanner;

public class ThirdTask {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите целое число от 8 до 12 (длина пароля): ");
        int len = scanner.nextInt();

        String allCharacters = LOWERCASE + UPPERCASE + DIGITS + SPECIAL;
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        password.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
        password.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        password.append(SPECIAL.charAt(random.nextInt(SPECIAL.length())));

        for (int i = 4; i < len; i++) {
            int index = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(index));
        }

        System.out.println(password);
    }
}
