import java.util.Scanner;

public class Main {
    public static final String ABC = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя- ";

    public static void main(String[] args) {
        String credentials = credentials();
        if(!credentials.isEmpty()) {
            razdel(credentials);
        }
    }

    public static String credentials() {
        System.out.println("Введите ФИО через пробел:");
        String input = new Scanner(System.in).nextLine();
        boolean isValid = true;
        for (int i = 0; i < input.length(); i++) {
            if (!ABC.contains(String.valueOf(input.charAt(i)))) {
                isValid = false;
                break;
            }
        }
        if(isValid){
            return input;
        }
        else {
            System.out.println("Введенная строка не является ФИО");
            return "";
        }
    }

    public static void razdel(String input) {
        input = input.replace("-", " ");
        int firstSpace = input.indexOf(" ");
        int secondSpace = input.indexOf(" ", firstSpace + 1);
        if(firstSpace != -1 && secondSpace != -1) {
            System.out.println("Фамилия: " + input.substring(0, firstSpace).trim());
            System.out.println("Имя: " + input.substring(firstSpace + 1, secondSpace).trim());
            System.out.println("Отчество: " + input.substring(secondSpace + 1).trim());
        }
        else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}