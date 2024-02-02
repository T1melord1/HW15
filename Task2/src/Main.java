import java.util.Scanner;

public class Main {
    public static final String ABC = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя-";

    public static void main(String[] args) {

        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.
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
            System.out.println("Ввод не верен");
            return "";
        }
    }

    public static void razdel(String input) {
        int firstSpace = input.indexOf(" ");
        int secondSpace = input.indexOf(" ", firstSpace + 1);
        if(firstSpace != -1 && secondSpace != -1) {
            System.out.println("Фамилия: " + input.substring(0, input.indexOf(" " )).trim());
            System.out.println("Имя: " + input.substring(input.indexOf(" "), input.lastIndexOf(" ")).trim());
            System.out.println("Отчество: " + input.substring(input.lastIndexOf(" ")).trim());
        }
        else {
            System.out.println("Ввод не верен");
        }

    }
}