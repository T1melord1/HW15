import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.
        razdel(credentials());

    }

    public static String credentials() {
        System.out.println("Введите ФИО через пробел:");
        String input = new Scanner(System.in).nextLine();
        return input;

    }
    public static void razdel(String input){
        System.out.println(input.substring(input.indexOf(" ")));
    }
}