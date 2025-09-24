package firstTask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class firstTask {

    public static int count(boolean[] arr, boolean symb){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == symb){
                count ++;
            }
        }
        return count;
    }

    public static int find(String str, char lett, int ind){
        for (int i = ind + 1; i < str.length(); i++){
            if (str.charAt(i) == lett){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] oop = {"инкапуляция", "наследование", "полиморфизм", "абстракция"};
        String[] mobDev = {"котлин", "джава", "свифт", "флаттер", "андроид"};
        String[] UI = {"анимация", "кастомизация", "адаптивность"};
        String[] back = {"синхронизация", "кэширование", "авторизация", "шифрование"};

        System.out.println("Выберите тему слов: 1 - ООП " +
                "2 - мобильная разработка " +
                "3 - пользовательский интерфейс " +
                "4 - бэкенд");

        int choice = scanner.nextInt();
        Random rand = new Random();
        String word = "";
        boolean flag = true;

        while (flag) {
            switch (choice) {
                case 1:
                    word = oop[rand.nextInt(oop.length)];
                    flag = false;
                    break;
                case 2:
                    word = mobDev[rand.nextInt(mobDev.length)];
                    flag = false;
                    break;
                case 3:
                    word = UI[rand.nextInt(UI.length)];
                    flag = false;
                    break;
                case 4:
                    word = back[rand.nextInt(back.length)];
                    flag = false;
                    break;
                default:
                    System.out.println("Введите число из списка: " + "1 - ООП " +
                            "2 - мобильная разработка " +
                            "3 - пользовательский интерфейс " +
                            "4 - бэкенд");
                    choice = scanner.nextInt();
            }
        }
        boolean[] letters = new boolean[word.length()];
        int lifes = 6;
        boolean rightWord = false;

        while (!rightWord && lifes > 0){
            for (int i = 0; i < letters.length; i++){
                if (letters[i]){
                    System.out.print(word.charAt(i));
                }
                else{
                    System.out.print("_");
                }
            }

            System.out.println("\nВведите букву");
            String letter = scanner.next();
            int index = word.indexOf(letter);
            if (index != -1){
                while (index != -1) {
                    letters[index] = true;
                    if (count(letters, false) == 0) {
                        rightWord = true;
                    }
                    index = find(word, letter.charAt(0), index);
                }
            }
            else {
                lifes--;
                System.out.println("Осталось жизней: " + lifes);
            }
            switch (lifes){
                case 5:
                    System.out.println("   _____");
                    System.out.println("     |\n     |");
                    System.out.println("    ----");
                    System.out.println("  |      |");
                    System.out.println("  |      |");
                    System.out.println("    ----");

                    break;
                case 4:
                    System.out.println("   _____");
                    System.out.println("     |\n     |");
                    System.out.println("    ----");
                    System.out.println("  |      |");
                    System.out.println("  |      |");
                    System.out.println("    ----");

                    System.out.println("      |");
                    System.out.println("      |");
                    System.out.println("      |");

                    break;
                case 3:
                    System.out.println("   _____");
                    System.out.println("     |\n     |");
                    System.out.println("    ----");
                    System.out.println("  |      |");
                    System.out.println("  |      |");
                    System.out.println("    ----");

                    System.out.println("     /|");
                    System.out.println("    / |");
                    System.out.println("      |");
                    break;
                case 2:
                    System.out.println("   _____");
                    System.out.println("     |\n     |");
                    System.out.println("    ----");
                    System.out.println("  |      |");
                    System.out.println("  |      |");
                    System.out.println("    ----");

                    System.out.println("     /|\\");
                    System.out.println("    / | \\");
                    System.out.println("      |");
                    break;
                case 1:
                    System.out.println("   _____");
                    System.out.println("     |\n     |");
                    System.out.println("    ----");
                    System.out.println("  |      |");
                    System.out.println("  |      |");
                    System.out.println("    ----");

                    System.out.println("     /|\\");
                    System.out.println("    / | \\");
                    System.out.println("      |");

                    System.out.println("     /");
                    System.out.println("    /");
                    break;
                case 0:
                    System.out.println("   _____");
                    System.out.println("     |\n     |");
                    System.out.println("    ----");
                    System.out.println("  |      |");
                    System.out.println("  |      |");
                    System.out.println("    ----");

                    System.out.println("     /|\\");
                    System.out.println("    / | \\");
                    System.out.println("      |");

                    System.out.println("     / \\");
                    System.out.println("    /   \\");

                    break;
            }
        }

        if (lifes == 0) {
            System.out.println("Загаданное слово: " + word);
        }
        System.out.println("Игра окончена");
    }
}
