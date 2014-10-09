public class Greetings {
    public static void main(String[] args) {
        String[] names = {"Иван", "Петр", "Федор", "Сидор", "Кузьма"};
        String[] res = greet(names);
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);
    }

    public static String[] greet(String[] names) {
        String[] greetings = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            greetings[i] = "Привет, " + names[i] + "!";
        }
        return greetings;
    }
}
