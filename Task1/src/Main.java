public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static void main(String[] args) {
        //todo код писать тут
        String ABC = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String a = String.valueOf(ABC);
        for (int i = 1; i <= ABC.length(); i++) {
            for (int j = 0; j < ABC.length(); j++) {
                int perevod = ((int) a.charAt(j));
                System.out.print("буква алфавита №" + i++ + " " + a.charAt(j) + " - ");
                System.out.println(perevod);
            }
        }
        }
}